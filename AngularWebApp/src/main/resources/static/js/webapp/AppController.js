'use strict';

/* Controllers */

angular.module('app')
	.controller('AppController', ['$scope','$log', 
	  function ($log) {
		    
		  var startAction = function () {
			  
			  $log.log('Avvio AppController ');
			  
			  $scope.PageTitle = 'Gestione App Clienti'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);