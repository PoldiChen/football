function test() {
	console.log("test");
	alert("test");
}

function editTeam(obj) {
	var td = $(obj).parent();
	console.log(td);
	var tds = $(td).siblings();
	var tdName = tds[0];
	var tdCity = tds[1];
	$(tdName).html("<input type='text' class='form-control' style='width:200px;' />");
	$(tdCity).html("<input type='text' class='form-control' style='width:200px;' />");
}