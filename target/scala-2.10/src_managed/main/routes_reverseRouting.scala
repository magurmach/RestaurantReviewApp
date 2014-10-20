// @SOURCE:/Users/sheikhahmed/Projects/RestaurantApp/conf/routes
// @HASH:5d7ad6a539fd4f8161094d3c03a5e543239ac034
// @DATE:Tue Oct 21 01:53:30 BDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


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
                  

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl {

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
        

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl.javascript {

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
        

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl.ref {


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
        
    