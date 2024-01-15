package app.msfaithlj.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import app.msfaithlj.constant.Constant
import app.msfaithlj.databinding.FragmentFirstBinding
import app.msfaithlj.model.BirthdayLetter


private const val TAG = "FirstFragment"

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(), BirthdayLetterItemClickListener {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv = binding.firstRv
        rv.layoutManager = LinearLayoutManager(requireContext())
        val adapter = BirthdayLetterAdapter(this)
        adapter.submitList(Constant.BDAY_LETTER_BY_MSFAITH(requireContext()))

        rv.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClickListener(birthdayLetter: BirthdayLetter) {
        Log.i(TAG, "onItemClickListener: ")
    }

}