package com.example.abhatripathi.iitline;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

public class FragmentVideo extends Fragment {
    RecyclerView recyclerView;
    Vector<itemVideo> youtubevideos=new Vector<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_video,container,false);
        RecyclerView recyclerView = v.findViewById(R.id.rvVideo);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gWRQqAtQzCw?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3xaZtmRcOpc?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mfK7OUe7whs?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rR4d5jRVlJg?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/W1vNK7rbrB8?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ay215LJFhFs?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XmOVrXQ_QPk?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zznGGAHx_os?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C_W43TZtg5w?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aerE1DMe6iA?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
//        youtubevideos.add(new itemVideo(""));
        videoAdapter videoAdapter=new videoAdapter(youtubevideos);
        recyclerView.setAdapter(videoAdapter);



        return v;
    }
}
