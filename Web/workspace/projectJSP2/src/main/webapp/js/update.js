function checkUpdate(){
	document.getElementById("nameDiv").innerHTML = "";
	document.getElementById("pwdDiv").innerHTML = "";
	if(document.getElementById("name").value == ""){
		document.getElementById("nameDiv").innerHTML = "이름를 입력하세요";
	}else if(document.getElementById("id").value == ""){
		document.getElementById("idDiv").innerHTML = "아이디를 입력하세요";
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerHTML = "비밀번호를 입력하세요.";
	}else if(document.getElementById("pwd").value != document.getElementById("repwd").value){
		document.getElementById("pwdDiv").innerText = "비밀번호가 일치하지 않습니다.";
	}else{
		document.getElementById("writeForm").submit();
	}
}
function change(){
	email2 = document.getElementById("email2").value = document.getElementById("email3").value;
}
function checkPost(){
	new daum.Postcode({
            oncomplete: function(data) {
                var addr = ''; // 주소 변수
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }
                document.getElementById('zipcode').value = data.zonecode;
                document.getElementById("addr1").value = addr;
                document.getElementById("addr2").focus();
            }
        }).open();
}