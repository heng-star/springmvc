package com.atguigu.spring.controller;


import com.atguigu.spring.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jsp")
public class Controller02 {

    //返回对象
    @RequestMapping(value ="/dojson.do")
    @ResponseBody
    public Student doSome01(HttpServletRequest httpRequest){

        //创建Java对想
        Student student = new Student("zs01",18);
//        student.setName("zhangsan02");
//        student.setAge(18);
        return  student;
    }

    //返回列表
    @RequestMapping(value ="/dojsonlist.do")
    @ResponseBody
    public List<Student> doSome02(HttpServletRequest httpRequest,
    String name,int age){

        //创建list
        List<Student> stu =new ArrayList<>();
        stu.add(new Student("zhangsan02",18));
        stu.add(new Student("lisi02",19));
        System.out.println(name +">-<"+age);
        return  stu;
    }

    //返回text,字符
    @RequestMapping(value ="/doReturnObjectString.do",
            produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doSome04(HttpServletRequest httpRequest){

        //
//        List<Student> stu =new ArrayList<>();
//        stu.add(new Student("zhangsan02",18));
//        stu.add(new Student("lisi02",19));
//        System.out.println(name +">-<"+age);
        return  "zheshi我的第一个返回文本";
    }

}
