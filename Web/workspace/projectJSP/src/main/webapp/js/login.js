function checkLogin(){
	document.getElementById("idDiv").innerHTML = "";
	document.getElementById("pwdDiv").innerHTML = "";
	if(document.getElementById("id").value == ""){
		document.getElementById("idDiv").innerHTML = "아이디를 입력하세요";
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerHTML = "비밀번호를 입력하세요.";
	}else{
		document.getElementById("loginForm").submit();
	}
	return false;
}
function goToUpdateForm(){
	document.getElementById("login").submit();
}
