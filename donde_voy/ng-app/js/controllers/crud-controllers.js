app.controller('crudIndexCtrl', function crudIndexCtrl($scope, $http, $location) {
	$http.get('js/json/crudBreadcrumb.json').success(function(data) {
		$scope.breadcrumb = data;
	});
});

app.controller('crudNavCtrl', function crudNavCtrl($scope, $http, $location) {
	$http.get('js/json/crudMenu.json').success(function(data) {
		$scope.nav = data;
	});

	var path = $location.path();

	console.log("location: " + path );

	if ( path == '/crud') {
		$scope.login.state = false;
	};
});

app.controller('crudBreadcrumbCtrl', function crudBreadcrumbCtrl($scope, $http, $location) {
	$http.get('js/json/crudBreadcrumb.json').success(function(data) {
		$scope.breadcrumb = data;
	});
});