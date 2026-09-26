package com.cha1se.duckmessenger.ui.naviagtion

sealed class Route(val route: String) {
    object ChatList: Route("chat_list")
    object Chat: Route("chat")
}