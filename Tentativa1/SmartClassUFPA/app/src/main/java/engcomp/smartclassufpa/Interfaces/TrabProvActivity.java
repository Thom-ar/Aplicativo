package engcomp.smartclassufpa.Interfaces;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
<<<<<<< HEAD:SmartClassUFPA/app/src/main/java/engcomp/smartclassufpa/TrabProvActivity.java
import java.util.ArrayList;
=======
import engcomp.smartclassufpa.Adapter.ProvasTrabalhosTabAdapter;
import engcomp.smartclassufpa.R;
>>>>>>> 8d55fbd84d7201a03b8be47bf95be278dd1f1e8d:SmartClassUFPA/app/src/main/java/engcomp/smartclassufpa/Interfaces/TrabProvActivity.java


public class TrabProvActivity extends BaseActivity {

    private ViewPager mViewPager;
    private ProvasTrabalhosTabAdapter tabAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Define o layout como a do drawer
        setContentView(R.layout.drawer_layout);
        setupNavDrawer(4); // *Ao chamar o método setupNavDrawer uma flag em int deve
                           // * ser enviada junto:
                           // * 1 - Início, 2 - Fotos, 3 - Horários, 4 - Trabalhos/Provas
                           // * 5 - Configurações, 6 - Sobre
                           // Por padrão, telas de configuração não exibem o Navigation Drawer
                           // Então a flag 5 não será usada por quem fizer a tela de configurações

        // Insere o layout da atividade no container do layout do drawer
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.container);
        //Em sua activity, substituir o "activity_inicio" pelo nome do seu layout XML
        getLayoutInflater().inflate(R.layout.activity_trabprov, contentFrameLayout);

<<<<<<< HEAD:SmartClassUFPA/app/src/main/java/engcomp/smartclassufpa/TrabProvActivity.java


        //recupera a reciclerview
        recyclerview = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        listaDeProva = new ArrayList<>();
        carregarLista();
        adapter = new ProvasReciclerViewAdapter(getApplicationContext(),listaDeProva);
        recyclerview.setAdapter(adapter);
        recyclerview.getAdapter().notifyDataSetChanged();
=======
        getSupportActionBar().setElevation(0);

        String[] titles = {"PROVAS","TRABALHOS"};
        tabAdapter = new ProvasTrabalhosTabAdapter(getSupportFragmentManager(),getApplicationContext(),titles);
        mViewPager = (ViewPager) findViewById(R.id.vp);
        mViewPager.setAdapter(tabAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
>>>>>>> 8d55fbd84d7201a03b8be47bf95be278dd1f1e8d:SmartClassUFPA/app/src/main/java/engcomp/smartclassufpa/Interfaces/TrabProvActivity.java

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //mSlidingTabLayout.setViewPager(mviewPager);

        // --> CÓDIGO DA TUA ATIVIDADE A PARTIR DAQUI <-- //

        /**
         *
         * PROJETO ACTIVITY TRABALHOS E PROVAS
         *
         * - definir Classes trabalho e Prova
         * - definir classe temporária para acesso ao banco de dados
         *
         * - definir interface de lista de trabalhos e provas
         * (lista de cards em ordem de data mais recente)
         * (trabalhos e provas separados por tabs)
         *
         * - definir interface de cadastro de trabalho e provas
         *
         *
         *  # Definição da activity
         * - consulta no banco de dados os trabalhos e provas
         * - faz o carregamento da activity através de consultas e passagem de mensagem
         * - escuta os eventos de click nos cards
         * - arrastar para apagar, clicar para ver mais detalhes
         *
         *
         *
         */



    }




}
