$(function(){
  $('#join').submit(function(){
    let user_id = $('input[name="user_id"]').val()
    // user_id에 값이 있으면 TRUE, 없으면 FALSE가 반환된다.
    if(!user_id){
      alert("아이디를 입력하세요.")
      $('input[name="user_id"]').focus()
      return false;
    }
    
    let user_pw = $('input[name="user_pw"]').val()
    if(!user_pw){
      alert("비밀번호 입력하세요.")
      $('input[name="user_pw"]').focus()
      return false;
    }

    if(!$('input[name="gender"]').is(':checked')){
      alert("성별을 입력하세요.");
      // document.form1.gender[0].checked = true;
      $('input[name="gender"]:eq(1)').attr('checked', true);
      return false;
    }

    let email = $('input[name="email"]').val();
    if(!email){
      alert("이메일을 입력하세요.")
      $('input[name="email"]').focus();
      return false;
    }
    
    let url = $('input[name="url"]').val();
    if(!url){
      alert("URL을 입력하세요.")
      $('input[name="url"]').focus();
      return false;
    }

    let phone = $('input[name="phone"]').val();
    if(!phone){
      alert("전화번호를 입력하세요.")
      $('input[name="phone"]').focus();
      return false;
    }

    if(!$('input[name="hobby"]').is(':checked')){
      alert("취미를 입력하세요.");
      // document.form1.hobby[0].checked = true;
      $('input[name="hobby"]:eq(1)').attr('checked', true);
      return false;
    }

    if($('select[name="job"] > option:selected').index() == 0){
      alert("직업를 선택하세요.");
      $('select[name="job"] > option:eq(1)').attr('selected', true);
    }
    let gender = $('input[name="gender"]:checked').val();
    let hobby = $('input[name="hobby"]:checked');
    var hobby_val = '';
    hobby.each(function(){
      hobby_val += $(this).val();
    });
    let job = $('select[name="job"] > option:selected').val();
 
    var result = `<ul>
                <li>아이디 : ` + user_id + `</li>
                <li>비밀번호 : ` + user_pw + `</li>
                <li>성별 : ` + gender + `</li>
                <li>이메일 : ` + email + `</li>
                <li>홈페이지 : ` + url + `</li>
                <li>핸드폰 : ` + phone + `</li>
                <li>취미 : ` + hobby_val + `</li>
                <li>직업 : ` + job + `</li>
                </ul>`;
    $('body').html(result);
    return false;
  });
});