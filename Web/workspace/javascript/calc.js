//빈 객체로 생성
var calc = {};

//멤버변수 추가 / 자바 => 필드
calc.x = 0;
calc.y = 0;

//맴버 함수 /자바 => 메소드
calc.setValue = function(x, y){
  this.x = x;
  this.y = y;
}

calc.plus = function(){
  return this.x + this.y;
}
calc.minus = function(){
  return this.x - this.y;
}
calc.result = function(){
  let sum = this.plus();
  let sub = this.minus();
  document.write("<p>덧셈 = " + sum + "</p>")
  document.write("<p>뺄셈 = " + sub + "</p>")
}
