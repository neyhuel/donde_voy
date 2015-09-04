//creamos el modulo y lo asignamos a app, para evitar escribir cada vez angular.module("app"); que sería el getter angular.module("app", []); es el setter
var app = angular.module('dondeVoy', ['ngRoute']);

app.constant('CONFIG', {
	TEMPLATE_DIR:"templates/",
	ROL_CURRENT_USER: 1
})
 
.constant('ROLES', {
	ADMIN: {
		ROL:1,
		PATH:"/404"
	},
	REGISTERED: {
		ROL:2,
		PATH:"/404"
	},
	GUEST: {
		ROL:3,
		PATH:"/404"
	}
})
 
//realizamos la configuración del enrutado dependiendo de la url con el objeto $routeProvider haciendo uso de when en este caso, cuando estemos en la página principal, le decimos que cargue el archivo templates/index.html y que haga uso del controlador indexController, así en todos los casos
app.config(function($routeProvider, CONFIG, ROLES){
	$routeProvider.when("/", {
		templateUrl : "templates/index.html",
		controller : "indexCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/home", {
		templateUrl : "templates/home.html",
		controller : "homeCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/nosotros", {
		templateUrl : "templates/nosotros.html",
		controller : "nosotrosCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/login", {
		templateUrl : "templates/login.html",
		controller : "loginCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/contacto", {
		templateUrl : "templates/contacto.html",
		controller : "contactoCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/registro", {
		templateUrl : "templates/registro.html",
		controller : "registroCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/recuperarpass", {
		templateUrl : "templates/recuperarpass.html",
		controller : "recuperarPassCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/logueado", {
		templateUrl : "templates/logueado.html",
		controller : "logueadoCtrl",
		data: {
			authorized: [ROLES.REGISTERED.ROL]
		}
	})
	.when("/404", {
		templateUrl : "templates/404.html",
		controller : "error404Ctrl",
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL,ROLES.GUEST.ROL]
		}
	})

	//Templates para CRUD
	.when("/crud", {
		templateUrl : "templates/crud/crud-index.html",
		controller : "crudIndexCtrl",
		data: {
			authorized: [ROLES.ADMIN.ROL]
		}
	})/*
	.when('/crud/info/:id', {
		templateUrl : "templates/info.html",
		controller : "infoController",
		data: {
			authorized: [ROLES.ADMIN.ROL]
		}
	})
	.when("/crud/add", {
		title: 'Añadir usuario',
		templateUrl : "templates/add.html",
		controller : "addController",
		data: {
			authorized: [ROLES.ADMIN.ROL]
		}
	})
	.when("/crud/edit/:id", {
		title: 'Editar usuario',
		templateUrl : "templates/edit.html",
		controller : "editController",
		data: {
			authorized: [ROLES.ADMIN.ROL]
		}
	})
	.when("/crud/remove/:id", {
		title: 'Eliminar usuario',
		templateUrl : "templates/remove.html",
		controller : "removeController",
		data: {
			authorized: [ROLES.ADMIN.ROL]
		}
	})*/
	.otherwise({ reditrectTo : "/" });
})
/*
.config(["$routeProvider", "CONFIG", "ROLES", function($routeProvider, CONFIG, ROLES)
{
	$routeProvider.when('/', {
		redirectTo: "/home"
	})
	.when("/home", {
		templateUrl: CONFIG.TEMPLATE_DIR+'home.html',
		controller: 'homeCtrl',
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/admin", {
		templateUrl: CONFIG.TEMPLATE_DIR+'admin.html',
		controller: 'adminCtrl',
		data: {
			authorized: [ROLES.ADMIN.ROL]
		}
	})
	.when("/registered", {
		templateUrl: CONFIG.TEMPLATE_DIR+'registered.html',
		controller: 'registeredCtrl',
		data: {
			authorized: [ROLES.ADMIN.ROL,ROLES.REGISTERED.ROL]
		}
	})
	.when("/guest", {
		templateUrl: CONFIG.TEMPLATE_DIR+'guest.html',
		controller: 'guestCtrl',
		data: {
			authorized: [ROLES.GUEST.ROL]
		}
	})
}])
*/

.run(["$rootScope", "$location", "CONFIG", "ROLES", function($rootScope, $location, CONFIG, ROLES)
{
	$rootScope.$on('$routeChangeStart', function (event, next) 
	{
        if (next.data !== undefined) 
        {
            if(next.data.authorized.indexOf(CONFIG.ROL_CURRENT_USER) !== -1)
			{
				console.log("entra");
			}
			else
			{
				if(CONFIG.ROL_CURRENT_USER == 1)
				{
					$location.path(ROLES.ADMIN.PATH);
				}
				else if(CONFIG.ROL_CURRENT_USER == 2)
				{
					$location.path(ROLES.REGISTERED.PATH);
				}
				else if(CONFIG.ROL_CURRENT_USER == 3)
				{
					$location.path(ROLES.GUEST.PATH);
				}
				
			}
        }
    });
}]);

app.controller('navCtrl', function ($scope, $http, $location) {

	var path = $location.path();

	switch(path) {
	    case '/':
	        $http.get('js/json/menu.json').success(function(data) {
	        	$scope.nav = data;
	        });
	        break;
	    case '/logueado':
	        $http.get('js/json/menu.json').success(function(data) {
	        	$scope.nav = data;
	        });
	        break;
	    case '/crud':
			$http.get('js/json/crudMenu.json').success(function(data) {
				$scope.nav = data;
			});
	        break;
	    default:
	        $http.get('js/json/menu.json').success(function(data) {
	        	$scope.nav = data;
	        });		
	} 
/*
	if ( path == '/logueado') {
		$http.get('js/json/menu.json').success(function(data) {
			$scope.nav = data;
		});
	};

	if ( path == '/crud') {
		$http.get('js/json/crudMenu.json').success(function(data) {
			$scope.nav = data;
		});
	};

	else{
		$http.get('js/json/menu.json').success(function(data) {
			$scope.nav = data;
		});		
	}*/
});