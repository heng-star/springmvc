package com.atguigu.spring.controller;

import com.atguigu.spring.entity.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@Controller
@RequestMapping("/jsp")
public class Controller01 {

    // QRequestMapping:请求映射,把指定的请求交给方法处理
    @RequestMapping(value ="/some.do")
    public ModelAndView doSome(HttpServletRequest httpRequest){

        System.out.println("处理 some.do请求");
        //调用 service处理请求,把处理结果放入到返回值 ModelAndview
        ModelAndView mv= new ModelAndView();
        mv.addObject("msg","使用注解的 SpringMVC应用");
        mv.addObject( "fun","doSome.."+
                httpRequest.getParameter("name1"));
        mv.addObject( "request","requeste:::...+"
                +httpRequest.getParameter("name2"));
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/posttest.do",method = RequestMethod.POST)
//    @RequestHeader
    public ModelAndView doposttest(){
        System.out.println("处理 posttest.do post请求");




        //调用 service处理请求,把处理结果放入到返回值 ModelAndview
        ModelAndView mv2= new ModelAndView();
        mv2.addObject("msgpost","使用注解的 SpringMVC post应用");
        mv2.addObject( "funpost","dpost");
        mv2.setViewName("posttest");
        return mv2;

    }

    //测试viod
    @RequestMapping(value ="/ajax.do")
    public void ajaxtest(HttpServletResponse response, String name, int age) throws IOException {
        System.out.println(name+"...."+age);



        Student student = new Student(name,age);
        String namename= name+name;
        int ageage =age+age;
        student.setAge(ageage);
        student.setName(namename);

        String josn ="";
        if (student!=null){

            ObjectMapper om =new ObjectMapper();
            josn =om.writeValueAsString(student);
        }

        System.out.println("josn....."+josn);

        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw= response.getWriter();
        pw.print (josn);
        pw.flush();
        pw.close();

        //return josn;


    }

}

