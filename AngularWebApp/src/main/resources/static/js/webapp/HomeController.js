'use strict';

/* Controllers */

angular.module('app')
	.controller('HomeController', ['$scope','$log', 
	  function ($scope,$log) {
		  
		  var startAction = function () {
			  
			  $log.log('Avvio HomeController');
			  
			  $scope.PageTitle = "Home Page";
			  
			  $scope.QtaNotif = "8";
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);