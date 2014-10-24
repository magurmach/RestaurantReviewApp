// @SOURCE:/Users/sheikhahmed/Projects/RestaurantApp/conf/routes
// @HASH:f653627c5d11c3f70b98c39ca02e786887d9884d
// @DATE:Fri Oct 24 15:39:14 BDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
package controllers.Franchise {

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseFranchiseManager {
    

// @LINE:25
def showAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "fr/list")
}
                                                

// @LINE:22
def createNewFranchise(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createNewFranchise")
}
                                                

// @LINE:24
def franchiseProfile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "franchise/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:23
def saveFranchiseAndShowProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "saveFranchise")
}
                                                
    
}
                          
}
                  

// @LINE:9
// @LINE:8
package controllers {

// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:5
package controllers.isdrun {

// @LINE:13
class ReverseUser {
    

// @LINE:13
def index(user:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "User/" + implicitly[PathBindable[String]].unbind("user", dynamicString(user)))
}
                                                
    
}
                          

// @LINE:14
class ReverseRestaurant {
    

// @LINE:14
def index(restaurant:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Restaurant/" + implicitly[PathBindable[String]].unbind("restaurant", dynamicString(restaurant)))
}
                                                
    
}
                          

// @LINE:5
class Reversehome {
    

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:15
class Reversetest {
    

// @LINE:15
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                
    
}
                          
}
                  

// @LINE:32
// @LINE:31
// @LINE:30
package controllers.Restaurant {

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseRestaurantManager {
    

// @LINE:31
def saveRestaurant(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "restaurantRegistration")
}
                                                

// @LINE:30
def createNewRestaurant(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createNewRestaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:32
def restaurantProfile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                
    
}
                          
}
                  

// @LINE:28
// @LINE:27
package controllers.Search {

// @LINE:28
// @LINE:27
class ReverseAnswerQueryWithJson {
    

// @LINE:27
def preload(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "srs/preload")
}
                                                

// @LINE:28
def answer(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search/" + implicitly[PathBindable[String]].unbind("query", dynamicString(query)))
}
                                                
    
}
                          
}
                  

// @LINE:34
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl {

// @LINE:34
class ReverseLogoutAndSessionClear {
    

// @LINE:34
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:16
class ReverseRegistrationAndLogin {
    

// @LINE:19
def saveUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userRegistration")
}
                                                

// @LINE:18
def newUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "new")
}
                                                

// @LINE:16
def verifier(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "test/JSON/")
}
                                                
    
}
                          

// @LINE:20
class ReverseProfile {
    

// @LINE:20
def profileProvider(userId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Profile/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                                                
    
}
                          
}
                  


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
package controllers.Franchise.javascript {

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseFranchiseManager {
    

// @LINE:25
def showAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.showAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fr/list"})
      }
   """
)
                        

// @LINE:22
def createNewFranchise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.createNewFranchise",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewFranchise"})
      }
   """
)
                        

// @LINE:24
def franchiseProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.franchiseProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "franchise/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def saveFranchiseAndShowProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.saveFranchiseAndShowProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveFranchise"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:9
// @LINE:8
package controllers.javascript {

// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:5
package controllers.isdrun.javascript {

// @LINE:13
class ReverseUser {
    

// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.User.index",
   """
      function(user) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("user", encodeURIComponent(user))})
      }
   """
)
                        
    
}
              

// @LINE:14
class ReverseRestaurant {
    

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.Restaurant.index",
   """
      function(restaurant) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Restaurant/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("restaurant", encodeURIComponent(restaurant))})
      }
   """
)
                        
    
}
              

// @LINE:5
class Reversehome {
    

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.home.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:15
class Reversetest {
    

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.test.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:32
// @LINE:31
// @LINE:30
package controllers.Restaurant.javascript {

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseRestaurantManager {
    

// @LINE:31
def saveRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.saveRestaurant",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurantRegistration"})
      }
   """
)
                        

// @LINE:30
def createNewRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.createNewRestaurant",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewRestaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:32
def restaurantProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.restaurantProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:28
// @LINE:27
package controllers.Search.javascript {

// @LINE:28
// @LINE:27
class ReverseAnswerQueryWithJson {
    

// @LINE:27
def preload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.AnswerQueryWithJson.preload",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "srs/preload"})
      }
   """
)
                        

// @LINE:28
def answer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.AnswerQueryWithJson.answer",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("query", encodeURIComponent(query))})
      }
   """
)
                        
    
}
              
}
        

// @LINE:34
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl.javascript {

// @LINE:34
class ReverseLogoutAndSessionClear {
    

// @LINE:34
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.LogoutAndSessionClear.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:16
class ReverseRegistrationAndLogin {
    

// @LINE:19
def saveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.RegistrationAndLogin.saveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userRegistration"})
      }
   """
)
                        

// @LINE:18
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.RegistrationAndLogin.newUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new"})
      }
   """
)
                        

// @LINE:16
def verifier : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.RegistrationAndLogin.verifier",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test/JSON/"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseProfile {
    

// @LINE:20
def profileProvider : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.Profile.profileProvider",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
package controllers.Franchise.ref {


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseFranchiseManager {
    

// @LINE:25
def showAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.showAll(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "showAll", Seq(), "GET", """""", _prefix + """fr/list""")
)
                      

// @LINE:22
def createNewFranchise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.createNewFranchise(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "createNewFranchise", Seq(), "GET", """""", _prefix + """createNewFranchise""")
)
                      

// @LINE:24
def franchiseProfile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.franchiseProfile(id), HandlerDef(this, "controllers.Franchise.FranchiseManager", "franchiseProfile", Seq(classOf[Integer]), "GET", """""", _prefix + """franchise/$id<[^/]+>""")
)
                      

// @LINE:23
def saveFranchiseAndShowProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.saveFranchiseAndShowProfile(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "saveFranchiseAndShowProfile", Seq(), "POST", """""", _prefix + """saveFranchise""")
)
                      
    
}
                          
}
        

// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:5
package controllers.isdrun.ref {


// @LINE:13
class ReverseUser {
    

// @LINE:13
def index(user:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.User.index(user), HandlerDef(this, "controllers.isdrun.User", "index", Seq(classOf[String]), "GET", """""", _prefix + """User/$user<[^/]+>""")
)
                      
    
}
                          

// @LINE:14
class ReverseRestaurant {
    

// @LINE:14
def index(restaurant:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.Restaurant.index(restaurant), HandlerDef(this, "controllers.isdrun.Restaurant", "index", Seq(classOf[String]), "GET", """""", _prefix + """Restaurant/$restaurant<[^/]+>""")
)
                      
    
}
                          

// @LINE:5
class Reversehome {
    

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.home.index(), HandlerDef(this, "controllers.isdrun.home", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:15
class Reversetest {
    

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.test.index(), HandlerDef(this, "controllers.isdrun.test", "index", Seq(), "GET", """""", _prefix + """test""")
)
                      
    
}
                          
}
        

// @LINE:32
// @LINE:31
// @LINE:30
package controllers.Restaurant.ref {


// @LINE:32
// @LINE:31
// @LINE:30
class ReverseRestaurantManager {
    

// @LINE:31
def saveRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.saveRestaurant(), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "saveRestaurant", Seq(), "POST", """""", _prefix + """restaurantRegistration""")
)
                      

// @LINE:30
def createNewRestaurant(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.createNewRestaurant(id), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "createNewRestaurant", Seq(classOf[Integer]), "GET", """""", _prefix + """createNewRestaurant/$id<[^/]+>""")
)
                      

// @LINE:32
def restaurantProfile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.restaurantProfile(id), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "restaurantProfile", Seq(classOf[Integer]), "GET", """""", _prefix + """restaurant/$id<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:28
// @LINE:27
package controllers.Search.ref {


// @LINE:28
// @LINE:27
class ReverseAnswerQueryWithJson {
    

// @LINE:27
def preload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.AnswerQueryWithJson.preload(), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "preload", Seq(), "GET", """""", _prefix + """srs/preload""")
)
                      

// @LINE:28
def answer(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.AnswerQueryWithJson.answer(query), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "answer", Seq(classOf[String]), "GET", """""", _prefix + """search/$query<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:34
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl.ref {


// @LINE:34
class ReverseLogoutAndSessionClear {
    

// @LINE:34
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.LogoutAndSessionClear.logout(), HandlerDef(this, "controllers.UserControl.LogoutAndSessionClear", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:16
class ReverseRegistrationAndLogin {
    

// @LINE:19
def saveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.RegistrationAndLogin.saveUser(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "saveUser", Seq(), "POST", """""", _prefix + """userRegistration""")
)
                      

// @LINE:18
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.RegistrationAndLogin.newUser(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "newUser", Seq(), "GET", """""", _prefix + """new""")
)
                      

// @LINE:16
def verifier(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.RegistrationAndLogin.verifier(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "verifier", Seq(), "POST", """""", _prefix + """test/JSON/""")
)
                      
    
}
                          

// @LINE:20
class ReverseProfile {
    

// @LINE:20
def profileProvider(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.Profile.profileProvider(userId), HandlerDef(this, "controllers.UserControl.Profile", "profileProvider", Seq(classOf[Long]), "GET", """""", _prefix + """Profile/$userId<[^/]+>""")
)
                      
    
}
                          
}
        
    