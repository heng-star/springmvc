    $(function () {
        $("#buttonAjax03").click(function () {
            $.ajax({
                url:"jsp/dojsonlist.do",
                data:{
                    name:"张三",
                    age:25
                },
                //type:"get",
                dataType:"json",
                success:function(data) {
                    $.each(data,function(i, n) {
                        alert(n.name + "....." + n.age)
                    })
                    //alert("resp:  " + resp.name + "...." + resp.age);
                    //alert("iibutton");
                }
            })

        })
    })

    $(function () {
        $("#buttonAjax04").click(function () {
            $.ajax({
                url:"jsp/doReturnObjectString.do",
                // data:{
                //     name:"张三",
                //     age:25
                // },
                //type:"get",
                //dataType:"json",
                success:function(data) {
                    // $.each(data,function(i, n) {
                    //     alert(n.name + "....." + n.age)
                    // })
                    //alert("resp:  " + resp.name + "...." + resp.age);
                    alert(data);
                }
            })

        })
    })