//验证表单是否为空，若为空则将焦点聚焦在input表单上，否则表单通过，登录成功
function check(form){
	//检查学号
	 var studentId = document.getElementsByName("studentId")[0].value;
     var span1 = document.getElementById("studentId_msg");
     if(studentId.trim() == ""){
    	 span1.style.display = "";
    	 return false;
     }         
     
     //检查密码
     var password = document.getElementsByName("password")[0].value;
     var span2 = document.getElementById("password_msg");
     if(password.trim() == ""){
    	 span2.style.display = "";
    	 return false;
     }  
     
     return true;
}


//校验账号的格式
function check_studentId() {      
      //获取学号
      var studentId = document.getElementsByName("studentId")[0].value;
      var span = document.getElementById("studentId_msg");
      if(studentId.trim() == ""){
    	  span.style.display = "";
        }else{
        	span.style.display = "none";
        }
}
    
function check_password(){
      var password = document.getElementsByName("password")[0].value;
      var span2 = document.getElementById("password_msg");
      if(password.trim() == ""){
    	  span2.style.display = "";
        }else{
        	span2.style.display = "none";
        }
}

