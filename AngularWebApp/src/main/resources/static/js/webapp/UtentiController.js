'use strict';

/* Controllers */

angular.module('app')
	.controller('UtentiController', ['$log', 
	  function ($log) {
		  
		  var self= this;
		  
		  var startAction = function () {
			  
			  $log.log('Avvio UtentiController ');
			  
			  self.PageTitle = 'Gestione Utenti'
			  
		  }
		  
		  var init = function () {
	          startAction();
	      };

	      init();
		  
	  }]);