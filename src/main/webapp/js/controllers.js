'use strict';

// -------------------------
// controllers.js
// -------------------------
var app = angular.module('App.controllers', []);

function HelloMessageController(HelloMessageFactory) {
    // inputMessage from form
    this.inputMessage = '';
    
    this.showMessage = function (){
        this.helloMessageFromJAXRS = HelloMessageFactory.query({"message" : this.inputMessage});

    };
}
app.controller('HelloMessageController', HelloMessageController);  // as helloMessageCtrl


function PathParamAdditionController(PathParamAdditionFactory) {
    // inputOp1, inputOp2 from form
    this.inputOp1 = '';
    this.inputOp2 = '';
    
    this.addNumbers = function (){
        this.pathParamAdditionFromJAXRS = PathParamAdditionFactory.query({
            "op1" : this.inputOp1,
            "op2" : this.inputOp2
        });

    };
}
app.controller('PathParamAdditionController', PathParamAdditionController);  // as pathParamAdditionCtrl