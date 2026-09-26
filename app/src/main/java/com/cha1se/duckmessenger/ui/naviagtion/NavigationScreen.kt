package com.cha1se.duckmessenger.ui.naviagtion

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
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