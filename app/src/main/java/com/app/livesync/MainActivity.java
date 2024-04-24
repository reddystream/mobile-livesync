package com.app.livesync;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.livesync.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    //private integration_service.AdService adService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //implementar e ajustar
        //AdView adView = findViewById(R.id.adView);
        //adService = new AdService(adView);
        //adService.loadAd();

        //LinearLayout layout = new LinearLayout(this);
        //layout.setOrientation(LinearLayout.VERTICAL);

        // Create a banner ad. The ad size and ad unit ID must be set before calling loadAd.
        //AdView mAdView = binding.adView;
        //mAdView.setAdSize(AdSize.BANNER);
        //mAdView.setAdUnitId("ca-app-pub-5145926574192140/7931654198");

        // Create an ad request.
        //AdRequest.Builder adRequestBuilder = new AdRequest.Builder();

        // Add the AdView to the view hierarchy.


        // Start loading the ad.
        //mAdView.loadAd(adRequestBuilder.build());
        //AdRequest adRequest = new AdRequest.Builder().build();
        //AdView mAdView = findViewById(R.id.adView);
        //mAdView.setAdUnitId("ca-app-pub-5145926574192140/7931654198");
        //mAdView.setAdSize(AdSize.BANNER);
        //mAdView.loadAd(adRequest);

        //setContentView(layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*ListView listView = findViewById(R.id.list_view);
        List<String> menuItens = new ArrayList<>();
        menuItens.add("Item 01");
        menuItens.add("Item 02");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItens);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String selectedItem = menuItens.get(position);
                Intent intent = new Intent(MainActivity.this, CameraPreviewActivity.class);
                startActivity(intent);
            }
        }); */

        //BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Supondo que liveList seja a lista de objetos Live que você deseja exibir no RecyclerView

// Criar uma lista de Live e adicionar alguns valores de exemplo
        List<Live> liveList = new ArrayList<>();
        liveList.add(new Live("Live 1", "Descrição da Live 1"));
        liveList.add(new Live("Live 2", "Descrição da Live 2"));
        liveList.add(new Live("Live 3", "Descrição da Live 3"));

// Criar uma instância do adaptador LiveAdapter e passar a lista de Live como argumento
        LiveAdapter adapter = new LiveAdapter(liveList, this);

// Configurar o RecyclerView para usar o adaptador
        recyclerView.setAdapter(adapter);



        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }



}