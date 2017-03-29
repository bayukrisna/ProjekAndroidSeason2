package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterTulang;

public class TulangActivity extends AppCompatActivity implements AdapterTulang.IDataAdapter {

    public static final String LINK_TULANG = "LinkTulang";
    public static final String ID_TULANG = "idTulang";
    AdapterTulang mAdapterTulang;
    ArrayList<TulangModel> datasHead = getHeadList();
    ArrayList<TulangModel> datasHand = getHandList();
    ArrayList<TulangModel> datasBody = getBodyList();
    ArrayList<TulangModel> datasFoot = getFootList();
    ArrayList<TulangModel> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulang);

        RecyclerView rvChord = (RecyclerView) findViewById(R.id.mRecyclerTulang);
        rvChord.setLayoutManager(new LinearLayoutManager(this));

        Integer anggota = getIntent().getIntExtra(Fragment3.ANGT, 0);

        if (anggota == 1) {
            mAdapterTulang = new AdapterTulang(this, datasHead);
            datas = datasHead;
        } else if (anggota == 2 || anggota == 4) {
            mAdapterTulang = new AdapterTulang(this, datasHand);
            datas = datasHand;
        } else if (anggota == 3) {
            mAdapterTulang = new AdapterTulang(this, datasBody);
            datas = datasBody;
        } else if (anggota == 5) {
            mAdapterTulang = new AdapterTulang(this, datasFoot);
            datas = datasFoot;
        }

        rvChord.setAdapter(mAdapterTulang);
    }

    //Mengisikan Data
    public ArrayList<TulangModel> getHeadList() {
        ArrayList<TulangModel> datas3 = new ArrayList<>();
        TulangModel data = new TulangModel("Arthritis Juvenile", "Juvenile rheumatoid arthritis (JRA) adalah suatu bentuk arthritis pada anak-anak.  JRA mempersulit anak untuk melakukan aktivitas sehari-hari seperti menulis, berpakaian, dan membawa barang (tangan, pergelangan tangan); berjalan, bermain, dan berdiri (pinggul, lutut, kaki); dan memutar kepala (leher).", "Gejala meliputi nyeri dan kaku pada sendi yang biasanya memburuk pada pagi hari namun membaik pada akhir hari.", "Kombinasi obat, terapi, olahraga, pendidikan, dan menyesuaikan aktivitas untuk mencegah kelelahan adalah pilihan terbaik. Dokter yang menangani arthritis harus merawat anak Anda.", R.drawable.arthritisjuvenileleher);
        datas3.add(data);
        data = new TulangModel("Herniasi Diskus Degeneratif", "Herniasi diskus degeneratif merupakan penyakit akibat diskus invertebralis kehilangan elastisitasnya. Kondisi ini bisa terjadi secara normal akibat penuaan", "Gejala yang sering dialami oleh penderita ini adalah nyeri leher.", "Operasi syaraf pada leher oleh dokter yang profesional.", R.drawable.herniasidiskusdegeneratif);
        datas3.add(data);
        data = new TulangModel("Pagets", "Penyakit Pagets adalah penyakit di mana daerah tulang menjadi menebal dan lembut dan ada peningkatan jumlah sel-sel tulang.", "Pusing, sakit tulang, sendi nyeri atau kaku, dan sakit leher", "Minum obat pereda rasa sakit seperti acetaminophen atau ibuprofen mungkin sudah cukup.Penyakit sedang atau parah diobati dengan obat‐obatan lainnya (bisphosphonates) untuk nyeri dan untuk memperlambat pertumbuhan tulang yang baru.", R.drawable.pagets);
        datas3.add(data);
        data = new TulangModel("Polymyalgia rheumatica (PMR)", "Polymyalgia rheumatica (PMR) adalah nyeri otot seluruh tubuh mulai tiba-tiba pada otot leher dan bahu dan kemudian menyebar ke bawah kembali ke pantat dan paha.", "Disertai dengan kekakuan, sakit kepala, demam dan umumnya merasa tidak sehat.", "penyakit yang biasanya digunakan dalam pengobatan steroid.Paling sering pilihan jatuh pada prednison dengan dosis 10 sampai 30 mg dalam sehari.Dosis harian dibagi menjadi 2 - 4 Penerimaan, dan itu semua tergantung pada intensitas nyeri, besarnya dan luasnya ESR melumpuhkan seseorang.", R.drawable.polymyalgiarheumatica);
        datas3.add(data);
        data = new TulangModel("Sindrom Behcet", "Sindrom Behcet adalah penyakit yang melibatkan peradangan pada pembuluh darah.", "Nyeri, pembengkakan dan kekakuan sendi.", "Dokter bisa meresepkan obat untuk mengurangi radang seperti nonstreoid dan menghilangkan gejala.", R.drawable.behcet);
        datas3.add(data);
        data = new TulangModel("Sindrom Klippel-Feil", "Penyakit langka turunan dengan ciri dua dari vertebrae pada tulang leher saling bergabung. Akibatnya tulang leher menjadi kaku dan sulit untuk digerakkan.", "Tulang leher pendek dan mengalami kesulitan saat menoleh", "X-ray tulang belakang menegaskan diagnosis penyakit.Selain itu, melakukan pemeriksaan neurologis pasien, memeriksa refleks tendon, mengevaluasi mobilitas leher.", R.drawable.kleppil);
        datas3.add(data);
        data = new TulangModel("Whiplash", "Utamanya menyerang sekitar tulang leher namun keluhan juga bisa sampai mencapai tulang punggung bagian atas.", "Rasa sakit muncul pada bagian leher dan tengkuk", "Gaya hidup yang memperhatikan keselamatan uatamanya bagian leher haruslah diterapkan. Sebisa mungkin minimalisir kegiatan yang mengancam kesehatan tubuh anda.", R.drawable.whiplash);
        datas3.add(data);

        return datas3;
    }

    public ArrayList<TulangModel> getHandList() {
        ArrayList<TulangModel> datas3 = new ArrayList<>();
        TulangModel data = new TulangModel("Arthritis Psoriatik", "Psoriatic arthritis (PsA) adalah bentuk peradangan sendi yang mempengaruhi individu dengan psoriasis kelainan kulit.", "Sendi biasanya kaku setelah beristirahat, pagi atau beristirahat di malam hari.Tissues seperti ligamen, tendon di sekitar sendi dan mungkin akan terlibat.", "Obat anti peradangan non-steroid atau salisilat diberikan untuk mengurangi nyeri dan peradangan sendi. Beberapa obat yang efektif untuk mengobati artritis rematoid juga digunakan untuk mengobati penyakit ini. Diantaranya adalah senyawa emas, methotrexate, cyclosporin dan sulfasalazine. Kadang steroid disuntikkan langsung ke persendian yang terkena.", R.drawable.arthritispsoriatik);
        datas3.add(data);
        data = new TulangModel("Arthritis Juvenile", "Juvenile rheumatoid arthritis (JRA) adalah suatu bentuk arthritis pada anak-anak.  JRA mempersulit anak untuk melakukan aktivitas sehari-hari seperti menulis, berpakaian, dan membawa barang (tangan, pergelangan tangan); berjalan, bermain, dan berdiri (pinggul, lutut, kaki); dan memutar kepala (leher).", "Gejala meliputi nyeri dan kaku pada sendi yang biasanya memburuk pada pagi hari namun membaik pada akhir hari.", "Kombinasi obat, terapi, olahraga, pendidikan, dan menyesuaikan aktivitas untuk mencegah kelelahan adalah pilihan terbaik. Dokter yang menangani arthritis harus merawat anak Anda.", R.drawable.arthritisjuveniletangan);
        datas3.add(data);
        data = new TulangModel("Athristid Reumatoid", "Radang yang umumnya menyerang pada sendi sendi tangan dan kaki,yang semakin lama semakin bertambah berat sakitnya.", "Kedua tangan terasa kaku pada pagi hari lebih dari setengah jam. Tidak enak badan ,kaku dan nyeri pada sendi,bengkak semu merah dan terasa hangat.", "Istirahat yang cukup,pakailah kaos kaki atau sarung tangan sewaktu tidur malam hari dan kurangi aktivitas yang berat secara perlahan lahan.", R.drawable.athristidreumatoid);
        datas3.add(data);
        data = new TulangModel("Carpal tunnel syndrome", "Carpal tunnel syndrome itu penyakit yang cukup umum. Kadang terasa mati rasa, kesemutan dan nyeri terbakar di tangan.", "Gejala memulai dengan yang terjadi di malam hari, sering mengganggu tidur, tapi mungkin juga dialami pada siang hari dan dalam beberapa kasus yang menjadi begitu parah Carpal tunnel syndrome dapat mengganggu penggunaan normal tangan.", "Lancarkan segala aliran darah ke seluruh tubuh, jangan sampai ada yang menghalangi aliran darah dengan menekan, memegang, dan menindih bagian tubuh dengan keras.", R.drawable.carpaltunnelsyndrome);
        datas3.add(data);
        data = new TulangModel("Fenomena Raynaud", "Fenomena Raynaud adalah suatu kondisi yang menyebabkan berkurangnya aliran darah ke jari-jari tangan, jari kaki, telinga, dan ujung hidung.", "Kulit mulanya menjadi putih kemudian biru dan ungu atau merah. Kondisi ini dapat berlangsung dari beberapa menit sampai beberapa jam. ", "Dokter mungkin meresepkan calcium channel blockers (seperti amlodipine) yang dapat meningkatkan aliran darah dengan menurunkan aliran darah. Jika obat-obat ini tidak membantu meredakan gejala yang parah, operasi yang disebut simpatektomi dapat disarankan. Operasi ini melibatkan pemotongan saraf yang menyebabkan pembuluh darah berkontraksi dan menurunkan aliran darah.", R.drawable.fenomena);
        datas3.add(data);
        data = new TulangModel("Fibromyalgia", "Kasus  borok kecil yang parah dapat terbentuk pada ujung jari dan kuku juga mungkin akan terpengaruh.", "Pertama ujung jari pergi putih dan dingin, jari-jari menjadi mati rasa dan mungkin menjadi kaku karena suplai darah yang terputus sementara. Kondisi ini mungkin ringan atau berat.", "Penggunaan obat-obatan, seperti obat pereda sakit (parasetamol atau tramadol), antidepresan yang meliputi amitriptyline, fluoxetine, dan duloxetine, serta antikonvulsan (gabapentin). Jika dibutuhkan, dokter juga bisa memberikan obat penenang atau obat tidur untuk meningkatkan kualitas tidur Anda.", R.drawable.fibromyalgia);
        datas3.add(data);
        data = new TulangModel("Herniasi Diskus Degeneratif", "Herniasi diskus degeneratif merupakan penyakit akibat diskus invertebralis kehilangan elastisitasnya. Kondisi ini bisa terjadi secara normal akibat penuaan.", "Gejala yang sering dialami oleh penderita ini adalah nyeri leher, nyeri bahu yang menjalar, dan kesulitan dalam menggerakkan tangan atau kaki. Pada kasus yang parah, dapat terjadi tonjolan tukang, yang mengakibatkan ruang saraf menyempit dan beresiko terkena gangguan persendian pada manusia.", "Operasi untuk kelainan tulang belakang servikal ditawarkan sebagai pilihan yang awal pada orang-orang yang jelas mengalami kelemahan otot yang disebabkan oleh kompresi akar saraf atau korda spinal. Hal ini dikarenakan otot yang lemah merupakan tanda yang pasti bahwa saraf tersebut mengalami cedera (lebih serius dari pada hanya nyeri yang dirasakan sebagai satu-satunya gejala), dan mengurangi tekanan pada saraf tersebut merupakan prioritas urgensi.", R.drawable.herniasidiskusdegeneratif);
        datas3.add(data);
        data = new TulangModel("Keseleo", "Keseleo umumnya timbul saat adanya peregangan berlebihan atau robekan ligamen karena stres berat yang mendadak pada sendi.", "kesulitan menggerakkan bagian yang terkena, misalnya lutut, kaki, atau tungkai.", "Hindari melakukan aktivitas selama 48-72 jam setelah mengalami keseleo agar pergelangan yang terinfeksi dapat beristirahat dan memperoleh waktu perawatan serta pemulihan yang cukup.", R.drawable.keseleo);
        datas3.add(data);
        data = new TulangModel("Oseomalacia ", "Oseomalacia adalah penyakit yang mempengaruhi terutama wanita dewasa, di mana tulang umumnya melunak karena pengendapan gangguan kalsium.", "Patah tulang yang terjadi tanpa cedera nyata dan kelemahan otot", "Pengobatan mungkin melibatkan vitamin D, kalsium, fosfor dan suplemen diminum. Orang yang tidak bisa menyerap nutrisi dengan baik melalui usus mungkin perlu dosis yang lebih besar dari vitamin D dan kalsium. Orang dengan kondisi tertentu mungkin perlu tes darah rutin untuk memantau kadar fosfor dan kalsium.", R.drawable.oseomalacia);
        datas3.add(data);
        data = new TulangModel("Radang Sendi (Arthritis)", "Radang sendi atau disebut juga sebagai arthritis merupakan suatu penyakit yang menyebabkan terjadinya inflamasi di dalam satu atau beberapa sendi.", "Gejala yang dirasakan penderita biasanya berupa rasa sakit, bengkak, kemerahan, atau sensasi hangat pada sendi yang meradang.", "Untuk mengatasi kasus radang sendi yang diakibatkan oleh serangan sistem kekebalan tubuh kita sendiri, dokter kemungkinan akan meresepkan kelompok obat disease-modifying antirheumatic drugs (DMARD), misalnya hydroxychlorquine atau methotrexate.", R.drawable.radangsenditangan);
        datas3.add(data);

        return datas3;
    }

    public ArrayList<TulangModel> getBodyList() {
        ArrayList<TulangModel> datas3 = new ArrayList<>();
        TulangModel data = new TulangModel("Ankylosing Spondylitis", "Rasa nyeri yang diderita oleh pasien biasa menyerang pada daerah tulang pertemuan pada daerah punggung cenderung bagian agak bawah. Yakni daerah yang terhubung antara tulang belakang dan juga bagian pelvis pada tubuh kita.", "Rasa sakit tulang belakang ini umumnya mengganggu aktifitas dengan intensitas yang besar. Sakit tulang belakang mampu menghambas kinerja keseharian karena dapat membuat tidak nyaman baik saat sedang berbaring, duduk, berdiri, berjalan dan kemungkinan sangat menghambat aktifitas bagi para pelari aktif.", "Jika Ankylosing Spondylitis telah parah, maka satu-satunya pilihan adalah dengan melakukan operasi penggantian sendi, khususnya di lutut dan pinggul. Meskipun beresiko, operasi juga dapat dilakukan terhadap pasien yang sudah terkena cacat fleksi tingkat akut, khususnya di leher.", R.drawable.ankylosingspondylitis);
        datas3.add(data);
        data = new TulangModel("Encok (Gout)", "Encok ( Gout ) adalah cacat kimia yang menyebabkan akumulasi dalam aliran darah dari produk metabolisme limbah juga dikenal sebagai asam urat.", "Rasa sakit dan linu yang terjadi pada daerah persendian", "Biasanya penyakit encok akan sembuh dengan sendirinya tanpa pengobatan, namun akan kembali meradang setelah cukup lama dan jika penyebab penyakit ini kembali dilakukan. Akan tetapi lebih baik lakukan pengecekan terlebih dahulu ke dokter untuk medapatkan penanganan dan jenis pengobatan yang tepat dan benar.", R.drawable.encok);
        datas3.add(data);
        data = new TulangModel("Frozen Shoulder", "Nyeri dan kaku pada bagian bahu karena berlebihan ketika menaruh beban di bahu dan posisi tidur yang salah.", "Nyeri dan kaku saat digerakkan utamanya menjadi hal yang sering dikeluhkan oleh penderita pada bagian bahu.", "Kurangi menaruh beban berlebbih pada pundak serta usahakan memilih posisi tidur paling nyaman dapat meminimalisir keluhan yang mungkin diderita oleh pasien.", R.drawable.frozen);
        datas3.add(data);
        data = new TulangModel("Kondisi Khusus (Tua)", "nyeri tulang belakang juga dapat dirasakan lantaran semakin bertambahnya beban yang harus ditopang tubuh karena kebiasaan buruk mulai dari meminum alkohol serta merokok juga memiliki manifestasi terhadap munculnya nyeri pada tulang belakang.", "Nyeri pada tulang belakang.", "Sering – seringlah beristirahat dan menjalani pola hidup sehat serta makan – makanan yang mengandung empat sehat lima sempurna.", R.drawable.tua);
        datas3.add(data);
        data = new TulangModel("Kifosis", "Kifosis sering disebut sebagai kelainan tulang belakang bagian atas yang terlalu membungkuk kedepan akibat sikap duduk yang salah. Namun penyebab kifosis bukan hanya itu saja. Secara medis, kifosis merupakan kondisi punggung atas yang mengalami pembengkokan belebihan.", "Pembentukan tulang belakang yang abnormal saat janin, Penuaan, Cidera tulang punggung", "Penanganan pada kifosis biasanya tidak perlu operasi. Penanganan yang sering dilakukan adalah dengan cara menggunakan penopang tulang untuk mengembalikan postur tubuh.", R.drawable.kifosis);
        datas3.add(data);
        data = new TulangModel("Lordosis", "Lordosis merupakan lekukan abnormal pada bagian lumbar dan servikal tulang belakang. Penyebab lordosis hampir sama dengan kifosis. Sebagian besar disebabkan oleh kebiasaan sikap tubuh yang buruk seperti pada latihan yang salah yang dilakukan penari.", "Rasa nyeri pada bagian tulang belakang dan punggung", "Penanganan yang biasa dilakukan adalah penggunaan penopang dan mengurangi latihan fisik yang membebani bagian lumbar.", R.drawable.lordosis);
        datas3.add(data);
        data = new TulangModel("Mielomeningokel", "Penyakit ini merupakan penyakit spina bifida yang paling sering. Pada penyakit ini saraf dan ujung saraf terbawa dalam kista dan tulang belakang yang terbentuk biasanya tidak lengkap jumlahnya.", "Kelumpuhan dan gangguan saraf lain.", "Penanganan yang paling tepat adalah dengan pembedahan spina bifida terbuka pada 2 x 24 jam setelah bayi dengan penyakit spina bifida dilahirkan. Namun deteksi dini penyakit ini sudah bisa dilakukan sejak bayi berusia 4 bulan dalam kandungan", R.drawable.mielomeningokel);
        datas3.add(data);
        data = new TulangModel("Osteoporosis", "Gejala pengeroposan tulang juga biasanya membidik daerah tulang belakang dengan sangat sering pada sebagaian besar penderita.", "Energi yang ada terasa cepat habis atau lelah, dan sangat mudah mengalami keseleo dan nyeri pada daerah – daerah tertentu (daerah yang diserang penyakit).", "Memberi asupan mencukupi untuk jarinan tulang layaknya konsumsi kalsium sangat dianjurkan demi mencegah munculnya penyakit satu ini. Utamanya meminum susu serta konsumsi ragam sayuran sehat dapat dijadikan opsi untuk memenuhi kebutuhan harian tubuh akan nutrisi tulang dan gigi yang satu ini.", R.drawable.osteo);
        datas3.add(data);
        data = new TulangModel("Polymyalgia RheuMatica (Rematik)", "Polymyalgia rheumatica (PMR) adalah nyeri otot seluruh tubuh mulai tiba-tiba pada otot leher dan bahu dan kemudian menyebar ke bawah kembali ke pantat dan paha.", "Disertai dengan kekakuan, sakit kepala, demam dan umumnya merasa tidak sehat.", "Perawatan rematik dilakukan dengan mengendalikan penyakit dan meredakan gejala yang timbul dengan mengonsumsi obat anti inflamasi non steroid dan analgesik. Obat yang mengandung steroid digunakan hanya jika gejala atau penyakit yang diderita sudah parah. Selain mengonsumsi obat-obatan, Anda juga dapat melakukan hal-hal lain untuk meredakan penyakit rematik, seperti mengurangi stres, berolahraga secara rutin, istirahat yang cukup, dan menjalani pola diet yang seimbang.", R.drawable.polymyalgiarheumatica);
        datas3.add(data);
        data = new TulangModel("Skoliosis", "Skoliosis adala kondisi abnormal tulang belakang yang berbengkok ke samping. Ciri yang jelas terlihat yaitu tinggi bahu kanan dan kiri tidak sama, pembengkokan tulang sangat terlihat jelas, perbedaan panjang kaki", "Gejala yang sering dialami penderita ini adalah nyeri punggung dan kesulitan berjalan.", "Pada anak anak penanganan yang dilakukan untuk penderita skoliosis adalah penggunaan penopang badan dan operasi untuk mengembalikan bentuk tubuh yang normal. Sedangkan untuk dewasa hanya diberi pengobatan untuk meredakan nyeri.", R.drawable.skoliosis);
        datas3.add(data);
        data = new TulangModel("Slipped Disc", "Rusaknya cakram tulang punggung kita akan berdampak pada persyarafan dan apada akhirnya akan membuat penderita mengalami rasa nyeri berkelanjutan.", "Cakram ini terancam atau bahkan terusak maka sakit yang amat akan dapat menyerang penderita.", "Dokter mungkin meresepkan obat untuk mengurangi rasa sakit dan mengendurkan otot punggung Anda. Anda harus membatasi aktivitas dan lebih banyak istirahat, lakukan olahraga ringan di bawah bimbingan dokter. Terapi fisik akan mencakup latihan khusus untuk meredakan sakit punggung. Ketika obat-obatan dan terapi fisik tidak efektif, dokter dapat menyuntikkan obat penghilang rasa sakit ke daerah yang terkena. Kadang-kadang Anda mungkin memerlukan pembedahan jika gejala masih ada setelah beberapa minggu pengobatan.", R.drawable.slippeddisc);
        datas3.add(data);
        data = new TulangModel("Stenosis", "Kondisi saat terjadi penyempitan jarak antara vertebrae yang menyebabkan adanya tekanan pada sumsum tulang belakang dan saraf.", "Stenosis dapat menimbulkan gejala seperti sering jatuh, sakit saat berjalan, dan kelumpuhan.", ":  Pengobatan penyakit stenosis dapat dilakukan dengan beberapa cara yaitu dengan mengubah postur,  pengobatan dengan aspirin atau ibupropen untuk mengurangi rasa sakit, istirahat, dan operasi.", R.drawable.stenosis);
        datas3.add(data);
        data = new TulangModel("TBC Tulang", "Penyakit satu ini dapat pula menyerang tulang belakang pada punggung. Dalam kondisi parah infeksi yang terjadi dapat menimbulkan nyeri peradangan yang disertai pula dengan kemunculan nanah. Kondisi tulang juga akan semakin melemah atau pun rapuh.", "Menimbulkan nyeri peradangan yang disertai pula dengan kemunculan nanah.", "Gaya hidup sehat sangatlah diharuskan demi mencegah perkembangan penyakit satu ini. Usahakan pula untuk menjaga agar lingkungan tinggal tidak justru terkesan lembab sepanjang waktu. Dan paling penting yakni sinar matahari harus bisa masuk ke dalam ruangan tinggal. Cahaya matahari pagi juga terbukti sangat bagus untuk perkembangan tulang kita menjadi senantiasa sehat.", R.drawable.tbctulang);
        datas3.add(data);

        return datas3;
    }

    public ArrayList<TulangModel> getFootList() {
        ArrayList<TulangModel> datas3 = new ArrayList<>();
        TulangModel data = new TulangModel("Arthritis Juvenile", "Juvenile rheumatoid arthritis (JRA) adalah suatu bentuk arthritis pada anak-anak.  JRA mempersulit anak untuk melakukan aktivitas sehari-hari seperti menulis, berpakaian, dan membawa barang (tangan, pergelangan tangan); berjalan, bermain, dan berdiri (pinggul, lutut, kaki); dan memutar kepala (leher).", "Gejala meliputi nyeri dan kaku pada sendi yang biasanya memburuk pada pagi hari namun membaik pada akhir hari.", "Kombinasi obat, terapi, olahraga, pendidikan, dan menyesuaikan aktivitas untuk mencegah kelelahan adalah pilihan terbaik. Dokter yang menangani arthritis harus merawat anak Anda.", R.drawable.arthritisjuvenilekaki);
        datas3.add(data);
        data = new TulangModel("Arthritis Reaktif", "Arthritis reaktif disebabkan oleh bakteri yang masuk melalui tubuh untuk sendi antara tulang. Sendi membengkak dan menjadi kaku dan menyakitkan.", "Ini biasanya mempengaruhi sendi lutut, pergelangan kaki atau kaki. Dalam kasus ekstrim juga dapat mempengaruhi mata, atau kulit juga otot.", "pengobatan pasien artritis reaktif menerima kortikosteroid tentu ditugaskan.Untuk obat tersebut termasuk Prednisolon, yang ditandai dengan efisiensi.Prednisolon mempengaruhi proses inflamasi, sehingga menurunkan nya.Prednisone tersedia dalam tiga bentuk: tablet, salep dan injeksi", R.drawable.arthritisreaktif);
        datas3.add(data);
        data = new TulangModel("Berdifusi Idiopatik Hyperostosis Skeletal (DISH)", "Bentuk terlalu banyak pertumbuhan tulang sepanjang sisi tulang dari tulang belakang dan berpengaruh pada struktur rangka kaki.", "Rasa sakit yang teramat sangat pada bagian punggung, tulang belakang, tumit, dan lutut. Khususnya daerah yang diserang.", "Harus dilakukan operasi pemotongan tulang belakang oleh dokter spesialis yang sudah profesional.", R.drawable.berdifusiidiopatikhyperostosisskeletal);
        datas3.add(data);
        data = new TulangModel("Bunions (Pembengkakan Ibu Jari)", "pembengkakan pada jaringan sendi ibu jari kaki yang menjadi lunak dan sangat sakit. Penyakit ini biasanya menyerang kedua ibu hari kaki pada saat yang bersamaan. Pembengkakan ibu hari kaki ini terjadi sebagai akibat penggunaan sepatu yang tidak cocok, berujung lancip atau kesempitan.", "Rasa nyeri yang teramat sangat pada ibu jari kedua kaki.", "Kurangi pemakaian sepatu yang memiliki ujung lancip serta gunakan kaos kaki apabila akan memakai sepatu.", R.drawable.bunions);
        datas3.add(data);
        data = new TulangModel("Kaki Bengkok", "Terjadi karena adanya gangguan pertumbuhan tulang pada pusat lutut atau karena tulang itu rapuh atau bisa juga disebabkan karena adanya penyakit lain seperti biri-biri, polio, bahkan lumpuh otak. Berat badan dan kebiasaan duduk di lantai dengan melipat kaki juga dapat membuat kaki menjadi bengkok.", "Kaki tidak berbentuk seperti pada umumnya dan sedikit melengkung. Biasanya terjadi pada anak - anak.", "Pantaulah tingkat vitamin D dalam pola makan anak. Penyakit rakitis, yang disebabkan oleh kurangnya vitamin D dalam pola makan adalah hal yang bisa menyebabkan timbulnya kaki melengkung.", R.drawable.kakibengkok);
        datas3.add(data);
        data = new TulangModel("Keseleo", "Keseleo umumnya timbul saat adanya peregangan berlebihan atau robekan ligamen karena stres berat yang mendadak pada sendi.", "kesulitan menggerakkan bagian yang terkena, misalnya lutut, kaki, atau tungkai.", "Hindari melakukan aktivitas selama 48-72 jam setelah mengalami keseleo agar pergelangan yang terinfeksi dapat beristirahat dan memperoleh waktu perawatan serta pemulihan yang cukup.", R.drawable.keseleo);
        datas3.add(data);
        data = new TulangModel("Osteoartritis (Keropos Sendi).", "Peradangan pada sendi yang disebabkan rapuhnya kapsul sendi,sehingga merusak lapisan tulang rawan yang menutup permukaan ujung ujung tulang.", "Nyeri dan kaku pada sendi,terutama pada waktu akan berdiri dan berjalan setelah lama duduk,apabila lutut dan pinggul yag terserang.", "Menggunakan alat khusus untuk membantu mengurangi rasa sakit saat pasien berdiri atau berjalan dan mengonsumsi obat-obatan tertentu, misalnya obat pereda rasa sakit atau obat anti inflamasi non-steroid.", R.drawable.osteoartritis);
        datas3.add(data);
        data = new TulangModel("Radang Sendi (Arthritis)", "Radang sendi atau disebut juga sebagai arthritis merupakan suatu penyakit yang menyebabkan terjadinya inflamasi di dalam satu atau beberapa sendi.", "Gejala yang dirasakan penderita biasanya berupa rasa sakit, bengkak, kemerahan, atau sensasi hangat pada sendi yang meradang.", "Untuk mengatasi kasus radang sendi yang diakibatkan oleh serangan sistem kekebalan tubuh kita sendiri, dokter kemungkinan akan meresepkan kelompok obat disease-modifying antirheumatic drugs (DMARD), misalnya hydroxychlorquine atau methotrexate.", R.drawable.radangsendikaki);
        datas3.add(data);
        data = new TulangModel("Spina Bifida Okulta", "Pada penyakit ini lapisan luar beberapa vertebrae tidak tertutup namun lubang yang terbentuk sangan kecil sehingga tidak ada sumsum tulang yang keluar.", "Penderita spina bifida okulta biasanya tidak mengalami gejala apapun atau hanya gejala kecil seperti tumbuh rambut, tanda lahir, atau cekungan", "Penanganan yang paling tepat adalah dengan pembedahan spina bifida terbuka pada 2 x 24 jam setelah bayi dengan penyakit spina bifida dilahirkan. Namun deteksi dini penyakit ini sudah bisa dilakukan sejak bayi berusia 4 bulan dalam kandungan", R.drawable.spinabifidaokulta);
        datas3.add(data);
        data = new TulangModel("Sindrom Behcet", "Sindrom Behcet adalah penyakit yang melibatkan peradangan pada pembuluh darah.", "Nyeri, pembengkakan dan kekakuan sendi.", "Dokter bisa meresepkan obat untuk mengurangi radang seperti nonstreoid dan menghilangkan gejala.", R.drawable.behcet);
        datas3.add(data);
        data = new TulangModel("Sindrom Ehlers-Danlos (EDS)", "Sindrom Ehlers-Danlos adalah gangguan yang mempengaruhi jaringan ikat yang mendukung kulit, otot, tendon dan ligamen.", "Orang dengan gangguan EDS cenderung memiliki sendi longgar, kulit yang mudah membentang, dan kecenderungan untuk mudah memar.", "Terapi fisik (digunakan untuk merehabilitasi mereka dengan ketidakstabilan sendi dan otot dan operasi untuk memperbaiki sendi yang rusak.", R.drawable.sindromehlersdanlos);
        datas3.add(data);

        return datas3;
    }

    @Override
    public void doClickTulang(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(LINK_TULANG, datas.get(pos));
        startActivity(intent);
    }
}
