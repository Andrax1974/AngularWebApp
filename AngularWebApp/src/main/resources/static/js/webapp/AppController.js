'use strict';

/* Controllers */

angular.module('app')
	.controller('AppController', ['$log', 
	  function ($log) {
		  
		  var self= this;
		  
		  var startAction = function () {
			  
			  $log.log('Avvio AppController ');
			  
			  self.PageTitle = 'Gestione App Clienti'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);