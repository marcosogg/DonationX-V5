package ie.setu.donationx.firebase.services

import com.google.firebase.auth.FirebaseUser
import ie.setu.donationx.firebase.auth.Response

typealias FirebaseSignInResponse = Response<FirebaseUser>

interface AuthService {
    val currentUserId: String
    val currentUser: FirebaseUser?
    val isUserAuthenticatedInFirebase: Boolean

    suspend fun authenticateUser(email: String, password: String)
                : FirebaseSignInResponse
    suspend fun createUser(name: String, email: String, password: String)
                : FirebaseSignInResponse
    suspend fun signOut()

}

