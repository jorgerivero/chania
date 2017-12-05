function grabarSolicitud(){
	/*
	$("button").click(function(){
    $.ajax({url: "demo_test.txt", success: function(result){
        $("#div1").html(result);
    }});
	});
	*/
	var solicitudObj = new Object();
    solicitudObj.nombre = $("input#nombre.form-control");
    solicitudObj.email = $("input#email.form-control");
    solicitudObj.descripcion = $("input#descripcion.form-control");
    solicitudObj.fecha = new Date().toString();
	solicitudObj.estatus = "vigente";
		
    //$("button").click(function(){
    //    $("div").text($.param(solicitudObj));
    //});
	//alert($.param(solicitudObj));
	$.post("solicitud_serv",
    solicitudObj,
    function(data, status){
        alert("Data: " + data + "\nStatus: " + status);
		$("input#nombre.form-control, input#email.form-control, textarea#comentarios.form-control").val("");
    });
	//alert("En breve no comunicaremos con usted!");
}
