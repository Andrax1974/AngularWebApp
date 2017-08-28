'use strict';

/* Controllers */

angular.module('app')
	.controller('ProdottiController', ['$scope','$log', 
	  function ($scope,$log) {
		  
		  var startAction = function () {
			  
			  $log.log('Avvio ProdottiController');
			  
			  $scope.PageTitle = 'Anagrafica Prodotti'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);