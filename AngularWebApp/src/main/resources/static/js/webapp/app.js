'use strict';

var MyApp = angular.module('app', ['ngRoute'])

MyApp.config(function($routeProvider) {
	
	$routeProvider.when('/index', {
		templateUrl : '/items/index',
		controller : 'HomeController'
	});
	
	$routeProvider.when('/prodotti', {
		templateUrl : '/items/prodotti',
		controller : 'ProdottiController'
	});
	
	$routeProvider.when('/app', {
		templateUrl : '/items/app',
		controller : 'AppController'
	});
	
	$routeProvider.when('/notifiche', {
		templateUrl : '/items/notifiche',
		controller : 'NotifController'
	});
	
	$routeProvider.when('/utente', {
		templateUrl : '/items/utente',
		controller : 'UtentiController'
	});
	
	/*
	$routeProvider.otherwise({
		redirectTo : '/index'
	});
	*/
	
});