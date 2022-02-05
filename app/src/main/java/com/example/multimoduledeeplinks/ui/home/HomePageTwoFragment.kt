package com.example.multimoduledeeplinks.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.multimoduledeeplinks.R
import com.example.multimoduledeeplinks.databinding.FragmentHomePageTwoBinding


class HomePageTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentHomePageTwoBinding.inflate(inflater, container, false)

        binding.goToNotifications.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://com.example.notifications/notification_fragment".toUri())
                .build()
            findNavController().navigate(request)
        }

        return binding.root
    }

}