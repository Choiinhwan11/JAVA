function checkWrite(){//유효성 검사.
	document.getElementById("nameDiv").innerHTML = "";
	document.getElementById("idDiv").innerHTML = "";
	document.getElementById("pwdDiv").innerHTML = "";
	
	if(document.getElementById("name").value == ""){
		document.getElementById("nameDiv").innerHTML = "이름 입력";
	}else if(document.getElementById("id").value == ""){
		document.getElementById("idDiv").innerHTML = "아이디를 입력하세요.";
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerHTML = "비밀번호 입력하세요.";
	}else if(document.getElementById("pwd").value != document.getElementById("repwd").value){
		document.getElementById("pwdDiv").innerText = "비밀번호가 일치하지 않습니다.";
	}else if(document.getElementById("checkIdNum").value != "확인됨"){
		document.getElementById("idDiv").innerHTML = "아이디를 중복조회하세요.";
	}else{
		document.getElementById("writeForm").submit()
	}
}
function idCheckPlease(){
	document.getElementById("checkIdNum").value = "확인필요";
	document.getElementById("idDiv").innerHTML = "아이디를 중복조회하세요.";
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
function checkId(){
	var id = document.getElementById('id').value;
	if(id == ""){
		alert("먼저 아이디를 입력하세요.");
	}else{
		window.open("checkId.jsp?id=" + id
				, "checkId"
				, " width=300 height=150 top=0 right=0");
	}
	checkId ++;
}
