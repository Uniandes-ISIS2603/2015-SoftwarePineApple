(function () {
    var providerModule = angular.module('providerModule', ['CrudModule', 'MockModule', 'salesModule', 'offerModule']);

   providerModule.constant('provider.skipMock', false);

     providerModule.config(['provider.context', 'MockModule.urlsProvider','provider.skipMock', function (context, urlsProvider, skipMock) {
           urlsProvider.registerUrl(context, skipMock);         
       }]);

})();