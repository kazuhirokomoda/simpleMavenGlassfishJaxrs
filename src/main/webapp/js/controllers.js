'use strict';

// -------------------------
// controllers.js
// -------------------------
var app = angular.module('App.controllers', []);

function HelloMessageController(HelloMessageFactory) { //$routeParams, 
    
    this.inputMessage = '';
    this.addMessage = function (){
        this.helloMessageFromJAXRS = HelloMessageFactory.query({"message" : this.inputMessage}); // $routeParams.message
        // initialize again
	this.inputMessage = '';
    };

}

app.controller('HelloMessageController', HelloMessageController);  // as simpleCtrl
