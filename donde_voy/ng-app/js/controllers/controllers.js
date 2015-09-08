app.controller("error404Ctrl", function error404Ctrl($scope, $location){

});

app.controller("indexCtrl", function indexCtrl($scope){

})

app.controller("homeCtrl", function homeCtrl($scope, $location){
	$scope.saludo = "Hola desde el controlador home";
	$scope.toLogin = function(){
		$location.url("/login");
	}
});
 
app.controller("loginCtrl", function loginCtrl($scope, $location){

	var admin_user = "admin";
	var admin_pass = "12345";
	var regis_user = "regis";
	var regis_pass = "12345";
	var guest_user = "guest";
	var guest_pass = "12345";
	var fail = false;

	$scope.signIn = function(event) {
	event.preventDefault();  // To prevent form refresh
	    var modelUser = $scope.login.user;
	    var modelPass = $scope.login.pass;

	    if (admin_user == modelUser && admin_pass == modelPass) {
	    	console.log('Authentication successful');
	    	$location.path( "/crud" );
	    } else{
	    	fail = true;
	    };

	    if (regis_user == modelUser && regis_pass == modelPass) {
	    	console.log('Authentication successful');
	    	$location.path( "/logueado" );
	    } else{
	    	fail = true;
	    };

	    if (guest_user == modelUser && guest_pass == modelPass) {
	    	console.log('Authentication successful');
	    	$location.path( "/logueado" );
	    } else{
	    	fail = true;
	    };

	    if (fail){
	    	$scope.login.fail = true;
	    	$scope.login.mensaje = "Datos no validos";
	    	console.log('Authentication failure');
	    };

	};
})

app.controller("contactoCtrl", function contactoCtrl($scope, $location){

	$scope.enviarForm = function(event) {
	event.preventDefault();  // To prevent form refresh
		var nombre = $scope.contacto.nombre
		var contenido = $scope.contacto.contenido
		var mail = $scope.contacto.mail
		
    	console.log("Nombre: "+ nombre + "Contenido: " + contenido + "Email: " + mail);
	
	};
});

app.controller("nosotrosCtrl", function registroCtrl($scope, $location){

});

app.controller("registroCtrl", function registroCtrl($scope, $location){
	$scope.enviarForm = function(event) {
	event.preventDefault();  // To prevent form refresh
		var mail = $scope.registro.mail
    	console.log(	"Datos del registro Nombre: " + $scope.registro.nombre +
    					"Apellido: " + $scope.registro.apellido +
    					"Email: " + $scope.registro.mail +
    					"Usuario: " + $scope.registro.user +
    					"Pass: " + $scope.registro.pass +
    					"PassRepeat: " + $scope.registro.passRepeat
    				);
	};
});

app.controller("recuperarPassCtrl", function recuperarPassCtrl($scope, $location){
	$scope.enviarForm = function(event) {
	event.preventDefault();  // To prevent form refresh
		var mail = $scope.recupera.mail
    	console.log("Te hemos enviado el link para restablecer tu contraseña al siguiente email: " + mail);
	};
});

app.controller("logueadoCtrl", function logueadoCtrl($scope, $location){

});
