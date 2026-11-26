import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.HudsonPrivateSecurityRealm

def user = User.get("admin", false)

if (user == null) {
    throw new Exception("Jenkins admin user not found")
}

user.addProperty(
    HudsonPrivateSecurityRealm.Details.fromPlainPassword("aar0n@_Man1ya")
)

user.save()
println("Jenkins admin password reset successfully")
