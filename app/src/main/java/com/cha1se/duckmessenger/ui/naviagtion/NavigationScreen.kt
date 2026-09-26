package com.cha1se.duckmessenger.ui.naviagtion

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cha1se.chat.presentation.ChatScreen
import com.cha1se.chat_list.presentation.ChatListScreen

@Composable
fun NavigationScreen(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navController,
        startDestination = Route.ChatList.route,
    ) {
        composable(Route.ChatList.route) {
            ChatListScreen(navController = navController)
        }
        composable(Route.Chat.route) {
            ChatScreen(navController = navController)
        }
    }
}