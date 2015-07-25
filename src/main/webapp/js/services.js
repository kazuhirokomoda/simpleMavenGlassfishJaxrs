'use strict';

// -------------------------
// services.js
// -------------------------
var services = angular.module('App.services', ['ngResource']);
var baseUrl = 'http://localhost\\:8080';
//var baseUrl = 'http://test-web-elb-1042768505.ap-northeast-1.elb.amazonaws.com\\:6060';


function HelloMessageFactory($resource, $http) {
    return $resource(baseUrl + '/simpleMavenGlassfishJaxrs/webresources/simple/hello/:message', {}, {
        query: {method: 'GET', isArray: false}
    });
}
services.factory('HelloMessageFactory', HelloMessageFactory);


function PathParamAdditionFactory($resource) {
    return $resource(baseUrl + '/simpleMavenGlassfishJaxrs/webresources/simple/path_param_addition/:op1/:op2/', {}, {
        query: {method: 'GET', isArray: false}
    });
}
services.factory('PathParamAdditionFactory', PathParamAdditionFactory);