<!doctype html>
<html lang="es" ng-app="dondeVoy">
<head>
	<meta charset="utf-8">
	<title>Donde Voy!</title>
	<link rel="shortcut icon" href="favicon.ico">
	<!-- Angular core -->
	<script src="js/lib/angular/angular.min.js"></script>
	<script src="js/lib/angular/angular-route.min.js"></script>
	<!-- Controladores de Angular -->
	<script src="js/mainCtrl.js"></script>
	<script src="js/controllers/controllers.js"></script>
	<script src="js/controllers/crud-controllers.js"></script>
	<!-- Librerias de Angular -->
	<script src="js/lib/ui-bootstrap/ui-bootstrap-0.13.3.js"></script>
	<script src="js/lib/ui-bootstrap/ui-bootstrap-tpls-0.13.3.min.js"></script>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="css/bootstrap.css">
	<!-- Bootstrap theme -->
	<link rel="stylesheet" href="css/bootstrap-theme.css">
	<!-- Bootstrap Vertical Tabs -->
	<link rel="stylesheet" href="css/bootstrap-vertical-tabs.css">
	<!-- Hoja de Estilos -->
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div ng-include="'templates/nav.html'"></div>

	<div ng-view></div>

	<!-- jQuery v2.1.3 -->
	<script src="js/jquery.min.js"></script>
	<!-- Scripts JavaScripts -->
	<script src="js/scripts.js"></script>
	<!-- Bootstrap JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>