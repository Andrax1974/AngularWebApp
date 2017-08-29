'use strict';

/* Controllers */

angular.module('app')
	.controller('NotifController', ['$scope','$log', 
	  function ($scope,$log) {
		  
		  var startAction = function () {
			  
			  $log.log('Avvio NotifController');
			  
			  $scope.PageTitle = 'Gestione Notifiche'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);