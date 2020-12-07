package kr.hs.emirim.s2019s05.mirimgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("갤러리 영화 포스터");

        Gallery gallery = findViewById(R.id.galler1);
        ImageView imgMain = findViewById(R.id.imgv_main);
        GalleryAdapter adapter = new GalleryAdapter(this,imgMain);
        gallery.setAdapter(adapter);
    }
}