package com.mnvsngv.cookpedia.backend

import com.mnvsngv.cookpedia.dataclass.RecipeItem

interface BackendListener {
    fun onLoginSuccess() {}
    fun onRegisterSuccess() {}
    fun notifyChange() {}
    fun onRegisterFailure() {}
    fun onLoginFailure() {}
    fun onRecipeUploadSuccess() {}
    fun onReadAllRecipes(recipes: List<RecipeItem>) {}
}