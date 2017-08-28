'use strict';

/* Controllers */

angular.module('app')
	.controller('ProdottiController', ['$log', 
	  function ($log) {
		  
		  var self= this;
		  
		  var startAction = function () {
			  
			  $log.log('Avvio ProdottiController ');
			  
			  self.PageTitle = 'Anagrafica Prodotti'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);