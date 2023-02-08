package com.example.imdb_deadlygray.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imdb_deadlygray.api.*
import com.example.imdb_deadlygray.databinding.FragmentHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {
    private val TAG: String = "MovieRequest"
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.recyclerViewpopulerMovie.layoutManager = LinearLayoutManager(requireContext() ,
        LinearLayoutManager.HORIZONTAL , false)
        binding.recyclerViewpopulerMovie.adapter = MovieAdaptorPoup(requireContext() , mutableListOf())
        binding.RecyclerViewTopRated.layoutManager = LinearLayoutManager(requireContext() ,
            LinearLayoutManager.HORIZONTAL , false)
        binding.RecyclerViewTopRated.adapter = MovieAdaptorTopRa(requireContext() , mutableListOf())

        binding.RecyclerViewLatest.layoutManager = LinearLayoutManager(requireContext() ,
            LinearLayoutManager.HORIZONTAL , false)
        binding.RecyclerViewLatest.adapter = MovieAdaptorLatest(requireContext() , mutableListOf())

        CoroutineScope(Dispatchers.Default).launch {
            try {
                val responsePoup = ClientPopular.getInstance().searchMovie(Credentials.APIkey).execute()
                Log.d(TAG, "onResponsePou: " + responsePoup.code())
                Log.d(TAG, "onResponsePou: " + responsePoup.body())
                val moviePoup = responsePoup.body()
                launch(Dispatchers.Main) {
                    binding.recyclerViewpopulerMovie.adapter =
                        MovieAdaptorPoup(requireContext() , moviePoup!!.result2s.toMutableList())
                }

                Log.d(TAG, "onResponsePou:ERROR " + responsePoup.errorBody())
            } catch (e: java.lang.Exception) {
                Log.e(TAG, "onCreate: ", e)
            }

            try {
                val responseTopRa = ClientTopRated.getInstance().searchMovieTopRated(Credentials.APIkey).execute()
                Log.d(TAG, "onResponseTopRa: " + responseTopRa.code())
                Log.d(TAG, "onResponseTopRa: " + responseTopRa.body())
                val movieTop = responseTopRa.body()
                launch(Dispatchers.Main) {
                    binding.RecyclerViewTopRated.adapter =
                        MovieAdaptorTopRa(requireContext() , movieTop!!.result2s.toMutableList())
                }

                Log.d(TAG, "onResponseTopRa:ERROR " + responseTopRa.errorBody())
            } catch (e: java.lang.Exception) {
                Log.e(TAG, "onCreate: ", e)
            }


            try {
                val responseLatest = ClientLatest.getInstance().searchMovieLatest(Credentials.APIkey).execute()
                Log.d(TAG, "onResponseLatest: " + responseLatest.code())
                Log.d(TAG, "onResponseLatest: " + responseLatest.body())
                val movielatest = responseLatest.body()
                launch(Dispatchers.Main) {
                    binding.RecyclerViewLatest.adapter =
                        MovieAdaptorLatest(requireContext() , movielatest!!.result2s.toMutableList())
                }

                Log.d(TAG, "onResponseLatest:ERROR " + responseLatest.errorBody())
            } catch (e: java.lang.Exception) {
                Log.e(TAG, "onCreate: ", e)
            }

        }
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}