$(function(){
	menuClick();
});

function menuClick() {
	$("#menuTop").click(function(){
		moveBottom(this);
	});
	$("#menuBottom").click(function(){
		moveTop(this);
	});
	$("#menuLeft").click(function(){
		moveRight(this);
	});
	$("#menuRight").click(function(){
		moveLeft(this);
	});
}

function moveTop(elem) {
	var topPercent = $(elem).css("top");
	topPercent = parseFloat(topPercent.substring(0,topPercent.indexOf(".")));
	var centerTop = ($(window).height() - 180) / 2;
	var moveTop = Math.abs(topPercent - centerTop) / 20;
	$("#menuLeft").css('display','none');
	$("#menuRight").css('display','none');
	$("#menuTop").css('display','none');
	var i = setInterval(function(){
		if((parseInt(topPercent) - parseInt(centerTop)) > 1){
			topPercent -= moveTop;
			$(elem).css("top",topPercent + "px");
		} else {
			clearInterval(i);
			$("#menuBottom").fadeOut(600);
			setTimeout(function() {
				window.location.href="./main/contactUs.jsp";
			},700);
		}
	},45);
}

function moveBottom(elem) {
	var topPercent = $(elem).css("top");
	topPercent = parseFloat(topPercent.substring(0,topPercent.indexOf(".")));
	var centerTop = ($(window).height() - 180) / 2;
	var moveTop = Math.abs(centerTop - topPercent) / 20;
	/*while(topPercent != centerTop) {  //崩溃(一直执行)
	 setTimeout(function() {
	 topPercent += moveTop;
	 $(elem).css("top",topPercent + "px");
	 }, 500);
	 }*/
	$("#menuLeft").css('display','none');
	$("#menuRight").css('display','none');
	$("#menuBottom").css('display','none');
	var i = setInterval(function(){
		if((parseInt(topPercent) - parseInt(centerTop)) < 1){
			topPercent += moveTop;
			$(elem).css("top",topPercent + "px");
		} else {
			clearInterval(i);
			$("#menuTop").fadeOut(600);
			setTimeout(function() {
				window.location.href="./main/userInf.jsp";
			},700);
		}
	},45);
}

function moveRight(elem) {
	var leftPercent = $(elem).css("left");
	leftPercent = parseFloat(leftPercent.substring(0,leftPercent.indexOf(".")));
	var centerLeft = ($(window).width() - 180) / 2;
	var moveLeft = Math.abs(leftPercent - centerLeft) / 20;
	$("#menuTop").css('display','none');
	$("#menuRight").css('display','none');
	$("#menuBottom").css('display','none');
	var i = setInterval(function(){
		if((parseInt(leftPercent) - parseInt(centerLeft)) < 1) {
			leftPercent += moveLeft;
			$(elem).css("left",leftPercent + "px");
		} else {
			clearInterval(i);
			$("#menuLeft").fadeOut(600);
			setTimeout(function() {
				window.location.href="./main/readBlog.jsp"
			},700);
		}
	},45);
}

function moveLeft(elem) {
	var leftPercent = $(elem).css("left");
	leftPercent = parseFloat(leftPercent.substring(0,leftPercent.indexOf(".")));
	//leftPercent = leftPercent.toFixed(1);
	var centerLeft = ($(window).width() - 180) / 2;
	var moveLeft = Math.abs(leftPercent - centerLeft) / 20;
	$("#menuTop").css('display','none');
	$("#menuLeft").css('display','none');
	$("#menuBottom").css('display','none');
	var i = setInterval(function(){
		if((parseInt(leftPercent) - parseInt(centerLeft)) > 1) {
			leftPercent -= moveLeft;
			//leftPercent = leftPercent.toFixed(1);
			//alert(parseInt(leftPercent) + ":" + parseInt(centerLeft))
			$(elem).css("left",leftPercent + "px");
		} else {
			clearInterval(i);
			$("#menuRight").fadeOut(600);
			setTimeout(function() {
				window.location.href="./main/writeBlog.jsp"
			},700);
		}
	},45);
}

