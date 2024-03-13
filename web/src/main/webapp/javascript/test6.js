/**
 * 
 */
var interval = null;
var timeout = null;
var interval2 = null;
var cnt = 0;

start();

function start() {
	// 1초 마다 해당 함수를 실행
	interval = setInterval(function() {
		console.log("A");
		var d = new Date(); // 현재 날짜 취득
		var txt = d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds(); // 시간 문자열 생성 
		var t = document.getElementById("t"); // 시간 넣을 객체 취득
		t.innerHTML = txt; // 시간 넣기
	}, 1000)
}

function startBtn() {
	if(interval == null) {
	start();		
	}
}

function stopBtn() {
	clearInterval(interval); // 해당작업을 취소하겠따.
	interval = null; // 변수를 null로 변경
}

function sBtn() {
	if(timeout == null) {
		cnt = Math.floor(Math.random() * 11 + 15); // 15 ~ 25
		
		timeout= setTimeout(function() {
			alert("발사");
		}, cnt * 1000 + 5000); // 20 ~ 30s
		
		interval2 = setInterval(function() {
			cnt--;
		}, 1000);
	}
}

function big() {
	clearTimeout(timeout);
	clearInterval(interval2);
	timeout = null;
	interval2 = null;
	
	if(cnt > 0) {
		alert("자폭");
	}
}

function goBtn() {
	location.href = "test5.html";
}

function backBtn() {
	history.back(); // 페이지 뒤로가기
}