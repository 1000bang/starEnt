let index = {

	init: function(){
		$("#btn--add").bind("click", () => {
			this.add();
		});
		
	},
	add: function() {
		
		let units = "";
		
		if ($("#unit").val() == "TRUE"){
			units = $("#unitname").val()
		}else {
			units = "false";
		};
		
		let data = {
			name: $("#name").val(), 
			birth: $("#birth").val(),
			unit : units
		};

		$.ajax({
			type: "POST",
			url: "/api/artist",
			data: JSON.stringify(data),
			contentType: "application/json; charset = utf-8",
			dataType: "json"
		}).done(function(data, textStatus, xhr) {
		
			if (data.httpStatus == "OK") {
				alert("추가 완료 ");
			}
			location.href = "/";
		}).fail(function(error) {
			console.log(error);
			alert(" 실패  " + error.responseJSON.error)
		});
		
	},

	



}

index.init();