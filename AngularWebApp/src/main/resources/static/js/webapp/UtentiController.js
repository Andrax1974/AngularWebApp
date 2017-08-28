'use strict';

/* Controllers */

angular.module('app')
	.controller('UtentiController', ['$scope','$log', 
	  function ($scope,$log) {
		   
		  var startAction = function () {
			  
			  $log.log('Avvio UtentiController ');
			  
			  $scope.PageTitle =  'Gestione Utenti'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);