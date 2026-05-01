package explorer.data;

import java.util.List;
import java.util.Map;

public final class MonumentRepository {
    private MonumentRepository() {
    }

    public static List<Monument> load() {
        return List.of(
            monument(
                "great-pyramid-of-giza",
                text("Great Pyramid of Giza", "الهرم الأكبر بالجيزة"),
                text("The last surviving wonder of the ancient world.", "أقدم عجائب الدنيا السبع القديمة الباقية حتى اليوم."),
                text(
                    "Built during the reign of Pharaoh Khufu around 2560 BCE, the Great Pyramid of Giza stands as the only surviving wonder of the ancient world and a supreme statement of Old Kingdom engineering, kingship, and sacred geometry.",
                    "شُيّد الهرم الأكبر في عهد الملك خوفو حوالي 2560 ق.م، ويُعد الناجي الوحيد من عجائب الدنيا السبع القديمة وتجسيدًا بارزًا لعبقرية الدولة القديمة في الهندسة والملكية والرمزية المقدسة."
                ),
                text(
                    "Rising above the Giza Plateau, the Great Pyramid was designed as Khufu's royal tomb and as an eternal machine of resurrection. Its core of limestone blocks, precise cardinal alignment, and once-polished casing made it one of the most intellectually ambitious monuments of the ancient world.",
                    "يرتفع الهرم الأكبر فوق هضبة الجيزة بوصفه مقبرة ملكية لخوفو وآلة أبدية للبعث. وقد جعلت كتل الحجر الجيري ومحاذاته الدقيقة للجهات الأصلية وكسوته المصقولة منه أحد أكثر آثار العالم القديم طموحًا من الناحية الفكرية والهندسية."
                ),
                text(
                    "The monument represents the mature peak of pyramid building and reveals how architecture, labor organization, royal ideology, and celestial belief were fused in Old Kingdom Egypt.",
                    "يمثل هذا الأثر ذروة تطور بناء الأهرامات، ويكشف كيف اندمجت العمارة وتنظيم العمل والأيديولوجيا الملكية والعقيدة الفلكية في مصر الدولة القديمة."
                ),
                text(
                    "It remains essential to any understanding of pharaonic architecture because it demonstrates the scale, precision, and symbolic ambition that defined royal monumentality in early Egypt.",
                    "يبقى الهرم الأكبر أساسيًا لفهم العمارة الفرعونية لأنه يُظهر مدى الضخامة والدقة والطموح الرمزي الذي ميّز الآثار الملكية في مصر المبكرة."
                ),
                text(
                    "For nearly 3,800 years it remained the tallest man-made structure on earth.",
                    "ظل الهرم الأكبر أعلى بناء شيده الإنسان على وجه الأرض لما يقرب من 3800 عام."
                ),
                text(
                    "Begin in Giza, where kings imagined eternity in stone and geometry.",
                    "ابدأ من الجيزة، حيث صاغ الملوك فكرة الخلود بالحجر والهندسة."
                ),
                text("Giza", "الجيزة"),
                "giza",
                era("Old Kingdom", "الدولة القديمة"),
                "old-kingdom",
                text(
                    "The Old Kingdom was the great age of pyramid building, when royal monuments turned the western desert into a theater of cosmic kingship.",
                    "كانت الدولة القديمة عصر بناء الأهرامات بامتياز، حين تحولت الصحراء الغربية إلى مسرح للملكية الكونية."
                ),
                type("Pyramid", "هرم"),
                "pyramid",
                "c. 2560 BCE",
                text("Pharaoh Khufu", "الملك خوفو"),
                -2560,
                28.0,
                42.0,
                List.of(
                    fact("Era / Kingdom", "Old Kingdom, 4th Dynasty", "العصر / المملكة", "الدولة القديمة، الأسرة الرابعة"),
                    fact("Location", "Giza Plateau", "الموقع", "هضبة الجيزة"),
                    fact("Type", "Royal pyramid", "النوع", "هرم ملكي"),
                    fact("Approximate date", "c. 2560 BCE", "التاريخ التقريبي", "حوالي 2560 ق.م"),
                    fact("Builder / Pharaoh", "Khufu", "الباني / الملك", "خوفو"),
                    fact("Height", "Originally 146.6 meters", "الارتفاع", "146.6 مترًا في الأصل")
                ),
                List.of("great-sphinx-of-giza"),
                images(
                    imagePath("great pyramid.jpg"),
                    imagePath("pyramid.jpeg")
                )
            ),
            monument(
                "great-sphinx-of-giza",
                text("Great Sphinx of Giza", "أبو الهول بالجيزة"),
                text("A colossal guardian linking royal authority with solar divinity.", "حارس هائل يربط السلطة الملكية بالرمزية الشمسية."),
                text(
                    "Cut from the living limestone of the Giza Plateau, the Great Sphinx combines the body of a lion with the face of a king, creating one of the most enduring symbols of power and protection in ancient Egypt.",
                    "نُحت أبو الهول من صخر هضبة الجيزة نفسه، جامعًا بين جسد الأسد ووجه الملك، ليغدو أحد أكثر رموز القوة والحماية بقاءً في مصر القديمة."
                ),
                text(
                    "Scholars generally associate the Sphinx with Pharaoh Khafre and the royal landscape of his pyramid complex. It stood not only as a sculptural marvel but also as a theological statement, connecting the king to solar power and divine guardianship.",
                    "يربط كثير من الباحثين أبو الهول بالملك خفرع وبالمشهد الملكي المحيط بمجمع هرمه. ولم يكن تمثالًا مذهلًا فحسب، بل بيانًا لاهوتيًا يربط الملك بالقوة الشمسية وبالحراسة الإلهية."
                ),
                text(
                    "The Sphinx shows how sculpture, landscape, and royal ideology worked together to create a monumental threshold between the living king, the dead ruler, and the cosmic order.",
                    "يكشف أبو الهول كيف اندمج النحت مع المشهد الطبيعي والأيديولوجيا الملكية لصناعة عتبة أثرية بين الملك الحي والملك المتوفى والنظام الكوني."
                ),
                text(
                    "Its significance lies in the way it binds image, royal theology, and the desert setting into a single monument of protective and political meaning.",
                    "تكمن أهميته في الطريقة التي يوحّد بها الصورة واللاهوت الملكي والمشهد الصحراوي في أثر واحد ذي معنى سياسي وحمائي."
                ),
                text(
                    "The ancient Egyptians later worshipped the Sphinx as a divine being linked to Hor-em-akhet, 'Horus in the Horizon.'",
                    "عبد المصريون القدماء أبو الهول لاحقًا ككيان إلهي مرتبط بحور إم أخت، أي «حورس في الأفق»."
                ),
                text(
                    "Stand before the Sphinx to feel the silence of a monument built to watch over dynasties.",
                    "قف أمام أبي الهول لتشعر بصمت أثر شُيّد ليراقب تعاقب الأسرات."
                ),
                text("Giza", "الجيزة"),
                "giza",
                era("Old Kingdom", "الدولة القديمة"),
                "old-kingdom",
                text(
                    "Old Kingdom royal monuments at Giza transformed the plateau into a carefully staged landscape of kingship and afterlife belief.",
                    "حوّلت آثار الدولة القديمة في الجيزة الهضبة إلى مشهد متقن للملكية وعقيدة العالم الآخر."
                ),
                type("Statue", "تمثال"),
                "statue",
                "c. 2500 BCE",
                text("Likely Pharaoh Khafre", "غالبًا الملك خفرع"),
                -2500,
                30.5,
                45.5,
                List.of(
                    fact("Era / Kingdom", "Old Kingdom, 4th Dynasty", "العصر / المملكة", "الدولة القديمة، الأسرة الرابعة"),
                    fact("Location", "Giza Plateau", "الموقع", "هضبة الجيزة"),
                    fact("Type", "Colossal limestone statue", "النوع", "تمثال ضخم من الحجر الجيري"),
                    fact("Approximate date", "c. 2500 BCE", "التاريخ التقريبي", "حوالي 2500 ق.م"),
                    fact("Related historical figure", "Probably Khafre", "الشخصية التاريخية المرتبطة", "على الأرجح خفرع"),
                    fact("Meaning", "Guardian and solar symbol", "الدلالة", "حارس ورمز شمسي")
                ),
                List.of("great-pyramid-of-giza"),
                images(
                    imagePath("sphinx2.jpg"),
                    imagePath("sphinx2.jpg")
                )
            ),
            monument(
                "white-chapel-of-senusret-i",
                text("White Chapel of Senusret I", "المقصورة البيضاء لسنوسرت الأول"),
                text("A refined Middle Kingdom kiosk later preserved within Karnak.", "مقصورة راقية من الدولة الوسطى حُفظت لاحقًا داخل الكرنك."),
                text(
                    "Originally erected by Senusret I, the White Chapel is one of the finest surviving examples of Middle Kingdom ceremonial architecture and relief carving.",
                    "أقام سنوسرت الأول المقصورة البيضاء، وهي من أروع النماذج الباقية لعمارة وادي النيل الاحتفالية ونقوشها في الدولة الوسطى."
                ),
                text(
                    "The chapel once stood in the ceremonial landscape of Karnak and was later dismantled and reused inside a pylon. Its modern reconstruction has made it a key witness to Middle Kingdom kingship, ritual procession, and the artistic precision of the 12th Dynasty.",
                    "كانت المقصورة قائمة ضمن المشهد الاحتفالي في الكرنك، ثم فُككت واستُخدمت أحجارها في صرح لاحق. وأتاح ترميمها الحديث رؤيتها بوصفها شاهدًا مهمًا على ملكية الدولة الوسطى وطقوس المواكب ودقة الفن في الأسرة الثانية عشرة."
                ),
                text(
                    "It gives visitors a rare and elegant glimpse into a major historical period often overshadowed by the pyramids and the New Kingdom temples.",
                    "تمنح الزائر لمحة نادرة وأنيقة عن فترة تاريخية كبرى كثيرًا ما تطغى عليها شهرة الأهرامات ومعابد الدولة الحديثة."
                ),
                text(
                    "The chapel matters because it preserves Middle Kingdom royal ceremony in unusually refined form and broadens the visitor's view of Egyptian monument history beyond the most familiar dynasties.",
                    "تكمن أهمية المقصورة في أنها تحفظ طقوس الملكية في الدولة الوسطى بصيغة شديدة الرهافة، وتوسع فهم الزائر لتاريخ الآثار المصرية خارج أكثر الأسر شهرة."
                ),
                text(
                    "Its reliefs preserve detailed geographic lists of Egyptian regions and sacred territories.",
                    "تحفظ نقوشها قوائم جغرافية دقيقة لأقاليم مصر وأراضيها المقدسة."
                ),
                text(
                    "Pause here to see the precision and restraint that define the Middle Kingdom courtly style.",
                    "توقف هنا لتتأمل الدقة والاتزان اللذين يميزان أسلوب البلاط في الدولة الوسطى."
                ),
                text("Luxor", "الأقصر"),
                "luxor",
                era("Middle Kingdom", "الدولة الوسطى"),
                "middle-kingdom",
                text(
                    "The Middle Kingdom restored royal authority after political fragmentation and produced refined monuments marked by discipline, clarity, and ritual order.",
                    "أعادت الدولة الوسطى ترسيخ السلطة الملكية بعد فترة اضطراب سياسي، وأنتجت آثارًا تتسم بالدقة والوضوح والنظام الطقسي."
                ),
                type("Chapel", "مقصورة"),
                "chapel",
                "c. 1950 BCE",
                text("Pharaoh Senusret I", "الملك سنوسرت الأول"),
                -1950,
                43.0,
                51.5,
                List.of(
                    fact("Era / Kingdom", "Middle Kingdom, 12th Dynasty", "العصر / المملكة", "الدولة الوسطى، الأسرة الثانية عشرة"),
                    fact("Location", "Karnak, Luxor", "الموقع", "الكرنك، الأقصر"),
                    fact("Type", "Ceremonial chapel", "النوع", "مقصورة احتفالية"),
                    fact("Approximate date", "c. 1950 BCE", "التاريخ التقريبي", "حوالي 1950 ق.م"),
                    fact("Builder / Pharaoh", "Senusret I", "الباني / الملك", "سنوسرت الأول"),
                    fact("Material", "Fine limestone", "المادة", "حجر جيري فاخر")
                ),
                List.of("karnak-temple", "luxor-temple"),
                images(
                    imagePath("white chapel.jpg"),
                    imagePath("white chapel2.jpg")
                )
            ),
            monument(
                "luxor-temple",
                text("Luxor Temple", "معبد الأقصر"),
                text("A ceremonial sanctuary shaped by royal ritual on the east bank of Thebes.", "معبد احتفالي تشكلت ملامحه بطقوس الملكية على البر الشرقي لطيبة."),
                text(
                    "Luxor Temple was built and expanded by rulers such as Amenhotep III and Ramses II, becoming one of the grand ceremonial centers of New Kingdom Egypt.",
                    "شُيّد معبد الأقصر وتوسع على يد ملوك مثل أمنحتب الثالث ورمسيس الثاني، ليصبح أحد أهم المراكز الاحتفالية في مصر الدولة الحديثة."
                ),
                text(
                    "More than a temple in the ordinary sense, Luxor was a living ceremonial stage for the renewal of kingship. During the Opet Festival, divine images traveled between Karnak and Luxor, affirming the sacred bond between Amun, the king, and the city of Thebes.",
                    "لم يكن معبد الأقصر معبدًا بالمعنى العادي فحسب، بل مسرحًا احتفاليًا حيًا لتجديد الملكية. ففي عيد الأوبت كانت تماثيل الآلهة تنتقل بين الكرنك والأقصر لتأكيد الرابطة المقدسة بين آمون والملك ومدينة طيبة."
                ),
                text(
                    "Its architecture captures how ritual, procession, and monumental urbanism came together along the Nile in the imperial age of Egypt.",
                    "تعكس عمارة المعبد كيفية التقاء الطقس الديني والمواكب والتخطيط العمراني الضخم على ضفاف النيل في العصر الإمبراطوري لمصر."
                ),
                text(
                    "Luxor Temple matters because it reveals kingship not merely as a political office, but as a ceremonial role renewed through sacred movement, festival, and public display.",
                    "تكمن أهمية معبد الأقصر في أنه يكشف الملكية لا كمنصب سياسي فحسب، بل كدور احتفالي يتجدد عبر الحركة المقدسة والمهرجانات والاستعراض العام."
                ),
                text(
                    "A later Roman camp and even a mosque became part of the temple's long layered history.",
                    "دخل المعسكر الروماني وحتى المسجد ضمن الطبقات التاريخية اللاحقة للمعبد."
                ),
                text(
                    "Follow the avenue of processions and enter a monument designed for public awe and divine ceremony.",
                    "اتبع طريق المواكب وادخل أثرًا صُمم للإبهار العام والطقوس الإلهية."
                ),
                text("Luxor", "الأقصر"),
                "luxor",
                era("New Kingdom", "الدولة الحديثة"),
                "new-kingdom",
                text(
                    "The New Kingdom was Egypt's imperial age, when temple complexes, funerary valleys, and royal monuments reached extraordinary ceremonial scale.",
                    "كانت الدولة الحديثة العصر الإمبراطوري لمصر، حين بلغت المعابد والجبانات والآثار الملكية حجمًا احتفاليًا استثنائيًا."
                ),
                type("Temple", "معبد"),
                "temple",
                "c. 1400 BCE",
                text("Amenhotep III and Ramses II", "أمنحتب الثالث ورمسيس الثاني"),
                -1400,
                44.5,
                57.5,
                List.of(
                    fact("Era / Kingdom", "New Kingdom, primarily 18th-19th Dynasties", "العصر / المملكة", "الدولة الحديثة، أساسًا الأسرتان 18 و19"),
                    fact("Location", "East Bank, Luxor", "الموقع", "البر الشرقي، الأقصر"),
                    fact("Type", "State temple", "النوع", "معبد دولة"),
                    fact("Approximate date", "c. 1400 BCE onward", "التاريخ التقريبي", "منذ نحو 1400 ق.م"),
                    fact("Builder / Pharaoh", "Amenhotep III, Ramses II", "الباني / الملك", "أمنحتب الثالث، رمسيس الثاني"),
                    fact("Festival", "Opet Festival", "المهرجان", "عيد الأوبت")
                ),
                List.of("karnak-temple", "valley-of-the-kings"),
                images(
                    imagePath("luxor temple.jpg"),
                    imagePath("Luxor, Egypt.jpeg")
                )
            ),
            monument(
                "karnak-temple",
                text("Karnak Temple Complex", "مجمع معابد الكرنك"),
                text("An immense sacred city built over centuries for Amun and royal power.", "مدينة مقدسة هائلة شُيّدت عبر قرون لعبادة آمون وتجسيد السلطة الملكية."),
                text(
                    "Karnak Temple Complex is one of the largest religious landscapes ever built, shaped by generations of pharaohs and centered on the cult of Amun-Ra.",
                    "يُعد مجمع معابد الكرنك واحدًا من أضخم المشاهد الدينية التي بناها الإنسان، وقد تشكل عبر أجيال من الفراعنة حول عبادة آمون رع."
                ),
                text(
                    "Karnak was not a single monument but a sacred city of pylons, courts, chapels, obelisks, and processional routes. Although its foundations go back to the Middle Kingdom, its most imposing expansions belong to the New Kingdom, when Thebes stood at the heart of Egyptian empire.",
                    "لم يكن الكرنك أثرًا واحدًا، بل مدينة مقدسة من الصروح والأفنية والمقاصير والمسلات وطرق المواكب. ورغم أن جذوره تعود إلى الدولة الوسطى، فإن أكثر توسعه مظهرًا يرتبط بالدولة الحديثة حين كانت طيبة في قلب الإمبراطورية المصرية."
                ),
                text(
                    "It is essential for understanding how religion, kingship, memory, and architecture were integrated into a ceremonial landscape of exceptional scale.",
                    "يُعد الكرنك أساسيًا لفهم كيفية اندماج الدين والملكية والذاكرة والعمارة في مشهد احتفالي بالغ الضخامة."
                ),
                text(
                    "No other site in Upper Egypt expresses the cumulative power of temple building more clearly, making Karnak a cornerstone for interpreting Egyptian state religion.",
                    "لا يعبّر أي موقع آخر في صعيد مصر عن القوة التراكمية لبناء المعابد بوضوح أكبر، مما يجعل الكرنك حجر أساس في تفسير دين الدولة المصرية."
                ),
                text(
                    "Its famous hypostyle hall once held 134 massive columns, creating one of antiquity's most overwhelming interior spaces.",
                    "احتوت قاعة الأعمدة الشهيرة فيه على 134 عمودًا ضخمًا، لتشكّل واحدًا من أكثر الفراغات الداخلية إبهارًا في العالم القديم."
                ),
                text(
                    "Karnak is where architecture becomes procession, memory, and statecraft in stone.",
                    "الكرنك هو الموضع الذي تتحول فيه العمارة إلى موكب وذاكرة وسياسة محفورة في الحجر."
                ),
                text("Luxor", "الأقصر"),
                "luxor",
                era("New Kingdom", "الدولة الحديثة"),
                "new-kingdom",
                text(
                    "The New Kingdom transformed Thebes into a monumental ceremonial capital, and Karnak became its greatest sacred expression.",
                    "حوّلت الدولة الحديثة طيبة إلى عاصمة احتفالية مهيبة، وأصبح الكرنك أعظم تجلياتها المقدسة."
                ),
                type("Temple", "معبد"),
                "temple",
                "c. 2000-300 BCE, with major New Kingdom expansion",
                text("Many pharaohs, especially Seti I and Ramses II", "ملوك كثيرون، خصوصًا سيتي الأول ورمسيس الثاني"),
                -1390,
                46.5,
                55.5,
                List.of(
                    fact("Era / Kingdom", "Middle Kingdom to Late Period, with major New Kingdom growth", "العصر / المملكة", "من الدولة الوسطى إلى العصر المتأخر، مع توسعات كبرى في الدولة الحديثة"),
                    fact("Location", "Karnak, Luxor", "الموقع", "الكرنك، الأقصر"),
                    fact("Type", "Temple complex", "النوع", "مجمع معابد"),
                    fact("Approximate date", "c. 2000-300 BCE", "التاريخ التقريبي", "حوالي 2000-300 ق.م"),
                    fact("Related historical figures", "Seti I, Ramses II, Hatshepsut, Thutmose III", "الشخصيات التاريخية المرتبطة", "سيتي الأول، رمسيس الثاني، حتشبسوت، تحتمس الثالث"),
                    fact("Known for", "Great Hypostyle Hall and sacred lake", "أشهر عناصره", "قاعة الأعمدة الكبرى والبحيرة المقدسة")
                ),
                List.of("white-chapel-of-senusret-i", "luxor-temple"),
                images(
                    imagePath("karnak.jpg"),
                    imagePath("Karnak Temple Luxor _ pharaohs’ fingerprints _ Egypt United Tours.jpeg")
                )
            ),
            monument(
                "valley-of-the-kings",
                text("Valley of the Kings", "وادي الملوك"),
                text("A royal necropolis where hidden tombs replaced pyramids.", "جبانة ملكية استبدلت الأهرامات بمقابر مخفية في الجبال."),
                text(
                    "The Valley of the Kings became the burial ground of New Kingdom pharaohs, where royal tombs were cut deep into the desert cliffs west of ancient Thebes.",
                    "أصبح وادي الملوك موضع دفن ملوك الدولة الحديثة، حيث نُحتت المقابر الملكية عميقًا في جبال الصحراء غرب طيبة القديمة."
                ),
                text(
                    "By choosing concealed tombs rather than visible pyramids, New Kingdom rulers transformed funerary architecture into an interior journey of texts, painted chambers, and sacred geography. The site is most famous for the tomb of Tutankhamun, but it housed many of Egypt's greatest rulers.",
                    "باختيار المقابر المخفية بدل الأهرامات الظاهرة، حوّل ملوك الدولة الحديثة العمارة الجنائزية إلى رحلة داخلية من النصوص والحجرات المصورة والجغرافيا المقدسة. ويشتهر الموقع بمقبرة توت عنخ آمون، لكنه ضم قبور عدد كبير من أعظم حكام مصر."
                ),
                text(
                    "The valley reveals changing ideas about kingship, secrecy, and the afterlife in imperial Egypt, and it remains one of the most important archaeological landscapes in the world.",
                    "يكشف الوادي عن تحولات في تصور الملكية والسرية والعالم الآخر في مصر الإمبراطورية، ويظل أحد أهم المشاهد الأثرية في العالم."
                ),
                text(
                    "It matters because it documents a major transformation in royal burial, shifting attention from visible monumentality to hidden theological space inside the mountain.",
                    "تكمن أهمية الوادي في توثيقه لتحول جوهري في الدفن الملكي، حيث انتقل التركيز من الأثر الظاهر إلى الفضاء اللاهوتي المخفي داخل الجبل."
                ),
                text(
                    "Ancient workmen's villages nearby preserve rare evidence of the artists and laborers who decorated royal tombs.",
                    "تحفظ قرى العمال القديمة المجاورة أدلة نادرة على الحرفيين والعمال الذين زينوا المقابر الملكية."
                ),
                text(
                    "Cross to the west bank and enter the quieter, more intimate landscape of royal eternity.",
                    "اعبر إلى البر الغربي وادخل المشهد الأكثر هدوءًا وحميمية لخلود الملوك."
                ),
                text("Luxor", "الأقصر"),
                "luxor",
                era("New Kingdom", "الدولة الحديثة"),
                "new-kingdom",
                text(
                    "New Kingdom rulers chose western Thebes as the stage for royal burial, creating a landscape where tomb architecture carried the king toward eternal regeneration.",
                    "اختار ملوك الدولة الحديثة غرب طيبة مسرحًا لدفنهم، فصنعوا مشهدًا تحمل فيه عمارة المقابر الملك نحو التجدد الأبدي."
                ),
                type("Necropolis", "جبانة"),
                "necropolis",
                "c. 1539 BCE onward",
                text("Tutankhamun and many New Kingdom pharaohs", "توت عنخ آمون وملوك كثر من الدولة الحديثة"),
                -1539,
                41.0,
                60.0,
                List.of(
                    fact("Era / Kingdom", "New Kingdom", "العصر / المملكة", "الدولة الحديثة"),
                    fact("Location", "West Bank, Luxor", "الموقع", "البر الغربي، الأقصر"),
                    fact("Type", "Royal necropolis", "النوع", "جبانة ملكية"),
                    fact("Approximate date", "From c. 1539 BCE", "التاريخ التقريبي", "منذ نحو 1539 ق.م"),
                    fact("Related historical figures", "Tutankhamun, Seti I, Ramses II, Thutmose III", "الشخصيات التاريخية المرتبطة", "توت عنخ آمون، سيتي الأول، رمسيس الثاني، تحتمس الثالث"),
                    fact("Known for", "Painted tomb corridors and hidden burial chambers", "أشهر ما يميزه", "ممرات المقابر المزخرفة وحجرات الدفن المخفية")
                ),
                List.of("tutankhamun-mask", "luxor-temple"),
                images(
                    imagePath("valley of the kings.jpg"),
                    imagePath("valley of kings2.jpg")
                )
            ),
            monument(
                "tutankhamun-mask",
                text("Tutankhamun's Golden Mask", "قناع توت عنخ آمون الذهبي"),
                text("A funerary masterpiece that shaped the world's image of ancient Egypt.", "تحفة جنائزية شكّلت صورة مصر القديمة في خيال العالم."),
                text(
                    "The golden funerary mask of Tutankhamun is one of the most celebrated objects of ancient Egyptian art, combining royal portraiture, sacred protection, and exquisite craftsmanship.",
                    "يُعد القناع الذهبي لتوت عنخ آمون من أشهر روائع الفن المصري القديم، إذ يجمع بين الصورة الملكية والحماية المقدسة وروعة الصنعة."
                ),
                text(
                    "Discovered in 1922 within the nearly intact tomb of Tutankhamun, the mask quickly became an international symbol of Egyptology. Its gold surface, inlaid glass, and semiprecious materials present the king as an eternal transfigured being under the protection of powerful deities.",
                    "اكتُشف القناع عام 1922 داخل مقبرة توت عنخ آمون شبه السليمة، وسرعان ما أصبح رمزًا عالميًا لعلم المصريات. ويُظهر سطحه الذهبي وتطعيماته الزجاجية وشبه الكريمة الملك في هيئة أبدية متحولة تحت حماية الآلهة."
                ),
                text(
                    "The mask matters not only as a treasure object, but as a key to funerary belief, royal identity, and the global rediscovery of Egypt's ancient past.",
                    "تكمن أهمية القناع ليس فقط في كونه كنزًا نفيسًا، بل أيضًا في كونه مفتاحًا لفهم العقيدة الجنائزية والهوية الملكية وإعادة اكتشاف الماضي المصري القديم عالميًا."
                ),
                text(
                    "Its enduring fame has made it one of the strongest ambassadors of Egyptian heritage in the modern imagination, linking archaeology with public fascination.",
                    "جعلته شهرته المستمرة أحد أقوى سفراء التراث المصري في الخيال الحديث، رابطًا بين علم الآثار والانبهار الجماهيري."
                ),
                text(
                    "Its pierced ears suggest the young king may have been represented with features associated with youthful royal imagery.",
                    "تشير ثقوب الأذنين فيه إلى أن صورة الملك ربما حافظت على سمات مرتبطة بالشباب في التصوير الملكي."
                ),
                text(
                    "Move from tomb architecture to royal artistry and see how a single face came to symbolize an entire civilization.",
                    "انتقل من عمارة المقابر إلى فن الملكية، وتأمل كيف صار وجه واحد رمزًا لحضارة كاملة."
                ),
                text("Cairo", "القاهرة"),
                "cairo",
                era("New Kingdom", "الدولة الحديثة"),
                "new-kingdom",
                text(
                    "New Kingdom royal burial created some of Egypt's most sophisticated objects of ritual and remembrance, joining theology with luxury craft.",
                    "أنتجت الجنازات الملكية في الدولة الحديثة بعضًا من أرقى الأعمال الطقسية والتذكارية في مصر، حيث التقت العقيدة بالحرفة الفاخرة."
                ),
                type("Artifact", "أثر"),
                "artifact",
                "c. 1323 BCE",
                text("Pharaoh Tutankhamun", "الملك توت عنخ آمون"),
                -1323,
                23.5,
                37.0,
                List.of(
                    fact("Era / Kingdom", "New Kingdom, 18th Dynasty", "العصر / المملكة", "الدولة الحديثة، الأسرة الثامنة عشرة"),
                    fact("Location", "Originally Valley of the Kings; now associated with Cairo collections", "الموقع", "أصله وادي الملوك؛ ويرتبط اليوم بمجموعات القاهرة المتحفية"),
                    fact("Type", "Funerary artifact", "النوع", "أثر جنائزي"),
                    fact("Approximate date", "c. 1323 BCE", "التاريخ التقريبي", "حوالي 1323 ق.م"),
                    fact("Related historical figure", "Tutankhamun", "الشخصية التاريخية المرتبطة", "توت عنخ آمون"),
                    fact("Discovery", "Howard Carter, 1922", "الاكتشاف", "هوارد كارتر، 1922")
                ),
                List.of("valley-of-the-kings", "nefertiti-bust"),
                images(
                    imagePath("tut.jpg"),
                    imagePath("tutankh.jpg")
                )
            ),
            monument(
                "nefertiti-bust",
                text("Bust of Nefertiti", "تمثال نفرتيتي النصفي"),
                text("An Amarna masterpiece of elegance, innovation, and royal image-making.", "تحفة من عصر العمارنة تجسد الأناقة والابتكار وصناعة الصورة الملكية."),
                text(
                    "The painted bust of Queen Nefertiti is among the most famous portraits from the ancient world, celebrated for its balance, polish, and unusual sense of living presence.",
                    "يُعد تمثال الملكة نفرتيتي النصفي من أشهر صور العالم القديم، ويشتهر بتوازنه وصقله وإحساسه الاستثنائي بالحضور الحي."
                ),
                text(
                    "Created during the Amarna Period, when Akhenaten and Nefertiti oversaw profound artistic and religious change, the bust reflects a moment of experimentation in royal art. Its carefully modeled features and vibrant color survive as a striking document of elite workshop practice.",
                    "أُنتج التمثال خلال عصر العمارنة، حين شهد الفن والدين تحولات عميقة في عهد أخناتون ونفرتيتي. وتعكس ملامحه المشكلة بعناية وألوانه النابضة لحظة من التجريب الفني في الورش الملكية."
                ),
                text(
                    "It matters because it preserves the visual language of one of Egypt's most debated historical moments and demonstrates the sophistication of sculptural practice in the late 18th Dynasty.",
                    "تكمن أهميته في حفظه للغة البصرية الخاصة بإحدى أكثر اللحظات التاريخية إثارة للجدل في مصر، وفي إظهاره رقي النحت في أواخر الأسرة الثامنة عشرة."
                ),
                text(
                    "The bust is especially important for visitors because it translates a complex historical moment into an immediately memorable human image.",
                    "تزداد أهمية التمثال للزوار لأنه يحول لحظة تاريخية معقدة إلى صورة إنسانية لا تُنسى بسهولة."
                ),
                text(
                    "One eye was never inlaid, which has fueled debate over whether the bust was a finished masterpiece or a studio model.",
                    "لم تُطعّم إحدى العينين قط، وهو ما أثار جدلًا حول ما إذا كان التمثال تحفة مكتملة أم نموذجًا تدريبيًا في الورشة."
                ),
                text(
                    "Nefertiti introduces a more intimate scale of beauty, individuality, and artistic experimentation.",
                    "تقدم نفرتيتي مقياسًا أكثر حميمية للجمال والفردية والتجريب الفني."
                ),
                text("Amarna", "العمارنة"),
                "amarna",
                era("Amarna Period", "عصر العمارنة"),
                "amarna-period",
                text(
                    "The Amarna Period was a brief but transformative era marked by religious reform, new courtly imagery, and a striking shift in artistic style.",
                    "كان عصر العمارنة فترة قصيرة لكنها مفصلية، تميزت بالإصلاح الديني وصور البلاط الجديدة والتحول اللافت في الأسلوب الفني."
                ),
                type("Statue", "تمثال"),
                "statue",
                "c. 1345 BCE",
                text("Queen Nefertiti and the workshop of Thutmose", "الملكة نفرتيتي وورشة تحتمس"),
                -1345,
                33.0,
                47.5,
                List.of(
                    fact("Era / Kingdom", "Amarna Period, late 18th Dynasty", "العصر / المملكة", "عصر العمارنة، أواخر الأسرة الثامنة عشرة"),
                    fact("Location", "Amarna", "الموقع", "العمارنة"),
                    fact("Type", "Painted bust", "النوع", "تمثال نصفي ملون"),
                    fact("Approximate date", "c. 1345 BCE", "التاريخ التقريبي", "حوالي 1345 ق.م"),
                    fact("Related historical figure", "Queen Nefertiti", "الشخصية التاريخية المرتبطة", "الملكة نفرتيتي"),
                    fact("Workshop", "Attributed to the sculptor Thutmose", "الورشة", "يُنسب إلى النحات تحتمس")
                ),
                List.of("tutankhamun-mask"),
                images(
                    imagePath("bust of nefertiti.jpg"),
                    imagePath("titi.jpg")
                )
            ),
            monument(
                "abu-simbel",
                text("Abu Simbel Temples", "معبدا أبو سمبل"),
                text("Colossal rock-cut temples proclaiming the authority of Ramses II.", "معبدان صخريان عملاقان يعلنان عظمة رمسيس الثاني."),
                text(
                    "Carved into the sandstone cliffs of Nubia, Abu Simbel is one of the most theatrical royal monuments of the New Kingdom and a masterpiece of political architecture.",
                    "نُحت أبو سمبل في صخور النوبة الرملية، ويُعد من أكثر الآثار الملكية مسرحية في الدولة الحديثة ومن روائع العمارة السياسية."
                ),
                text(
                    "The larger temple was dedicated to Ramses II and major deities of the state, while the smaller honored Queen Nefertari and Hathor. In the twentieth century the complex was famously relocated to save it from the waters raised by the Aswan High Dam, making Abu Simbel a symbol of both ancient ambition and modern preservation.",
                    "خُصص المعبد الأكبر لرمسيس الثاني ولعدد من آلهة الدولة، بينما كُرِّس الأصغر للملكة نفرتاري والإلهة حتحور. وفي القرن العشرين نُقل المجمع بصورة شهيرة لإنقاذه من مياه السد العالي، فأصبح رمزًا للطموح القديم والحفاظ الحديث على التراث معًا."
                ),
                text(
                    "Abu Simbel matters for its colossal imagery, solar alignment, Nubian setting, and its extraordinary modern rescue, which turned it into a global icon of heritage protection.",
                    "تكمن أهمية أبو سمبل في صوره الضخمة ومحاذاته الشمسية وموقعه النوبي وعملية إنقاذه الحديثة الاستثنائية التي جعلته أيقونة عالمية لحماية التراث."
                ),
                text(
                    "For the wider story of Egyptian tourism and heritage, Abu Simbel stands at the meeting point of ancient spectacle and modern international preservation.",
                    "وفي السياق الأوسع للسياحة والتراث المصري، يقف أبو سمبل عند نقطة التقاء بين الإبهار القديم وجهود الحفظ الدولية الحديثة."
                ),
                text(
                    "Twice each year, sunlight penetrates the temple to illuminate the sanctuary statues in a dramatic solar event.",
                    "مرتين في العام، يتسلل ضوء الشمس إلى المعبد ليضيء تماثيل قدس الأقداس في مشهد شمسي مهيب."
                ),
                text(
                    "Travel south to the edge of Nubia, where royal image-making meets the drama of the desert cliff.",
                    "سافر جنوبًا إلى تخوم النوبة، حيث يلتقي تشكيل الصورة الملكية بدراما الجبل الصحراوي."
                ),
                text("Aswan", "أسوان"),
                "aswan",
                era("New Kingdom", "الدولة الحديثة"),
                "new-kingdom",
                text(
                    "In the New Kingdom, Egypt projected imperial authority deep into Nubia, and Abu Simbel became one of its boldest visual statements.",
                    "في الدولة الحديثة بسطت مصر نفوذها الإمبراطوري عميقًا في النوبة، وأصبح أبو سمبل من أجرأ تجليات هذا النفوذ بصريًا."
                ),
                type("Temple", "معبد"),
                "temple",
                "c. 1264 BCE",
                text("Pharaoh Ramses II", "الملك رمسيس الثاني"),
                -1264,
                56.0,
                80.0,
                List.of(
                    fact("Era / Kingdom", "New Kingdom, 19th Dynasty", "العصر / المملكة", "الدولة الحديثة، الأسرة التاسعة عشرة"),
                    fact("Location", "Abu Simbel, Aswan", "الموقع", "أبو سمبل، أسوان"),
                    fact("Type", "Rock-cut temple complex", "النوع", "مجمع معابد منحوتة في الصخر"),
                    fact("Approximate date", "c. 1264 BCE", "التاريخ التقريبي", "حوالي 1264 ق.م"),
                    fact("Builder / Pharaoh", "Ramses II", "الباني / الملك", "رمسيس الثاني"),
                    fact("Modern significance", "UNESCO relocation in the 1960s", "الأهمية الحديثة", "نقله في مشروع لليونسكو خلال ستينيات القرن العشرين")
                ),
                List.of("philae-temple"),
                images(
                    imagePath("abu simble.jpg"),
                    imagePath("Abu Simbel Temples – Egypt’s Most Impressive Site.jpeg")
                )
            ),
            monument(
                "philae-temple",
                text("Temple of Philae", "معبد فيلة"),
                text("A graceful island sanctuary of Isis preserved through modern rescue.", "معبد جزيري أنيق للإلهة إيزيس حُفظ بجهد إنقاذ حديث."),
                text(
                    "The Temple of Philae stands among Egypt's most evocative late sacred sites, preserving the prestige of the goddess Isis in a dramatic Nile setting near Aswan.",
                    "يُعد معبد فيلة من أكثر المواقع المقدسة المتأخرة شاعرية في مصر، إذ يحفظ مكانة الإلهة إيزيس في مشهد نيلي درامي قرب أسوان."
                ),
                text(
                    "Although rooted in earlier traditions, the surviving complex is largely Ptolemaic and Roman in date. Its island setting, elegant colonnades, and long ritual afterlife made Philae one of the last active centers of ancient Egyptian religion before the final closure of the temples.",
                    "ورغم جذوره الأقدم، فإن المجمع الباقي يعود في معظمه إلى العصرين البطلمي والروماني. وقد جعل موقعه الجزيري وأروقته الأنيقة واستمرارية طقوسه منه أحد آخر المراكز النشطة للديانة المصرية القديمة قبل إغلاق المعابد نهائيًا."
                ),
                text(
                    "Philae matters because it bridges pharaonic tradition, Hellenistic patronage, and the endurance of Egyptian cult in the late ancient world.",
                    "تكمن أهمية فيلة في كونه يجسر بين التقاليد الفرعونية والرعاية الهلنستية واستمرار العبادة المصرية في العالم القديم المتأخر."
                ),
                text(
                    "It is one of the clearest places to see how Egyptian religion adapted without losing its identity under later Mediterranean empires.",
                    "ويُعد من أوضح المواقع التي تُظهر كيف تكيف الدين المصري من دون أن يفقد هويته تحت الإمبراطوريات المتوسطية اللاحقة."
                ),
                text(
                    "Like Abu Simbel, Philae was also moved in the modern era to protect it from flooding.",
                    "وكما حدث في أبو سمبل، نُقل معبد فيلة أيضًا في العصر الحديث لحمايته من الغرق."
                ),
                text(
                    "Continue along the Nile toward a later chapter of Egypt's sacred memory, where the old gods endured into a new age.",
                    "واصل رحلتك على امتداد النيل إلى فصل متأخر من الذاكرة المقدسة لمصر، حيث استمرت عبادة الآلهة القديمة في زمن جديد."
                ),
                text("Aswan", "أسوان"),
                "aswan",
                era("Ptolemaic Period", "العصر البطلمي"),
                "ptolemaic-period",
                text(
                    "In the Ptolemaic Period, Egyptian sacred traditions continued under new rulers, producing monuments that blended continuity, devotion, and international court culture.",
                    "في العصر البطلمي استمرت التقاليد المقدسة المصرية تحت حكم جديد، فأنتجت آثارًا تمزج بين الاستمرارية والتعبد وثقافة البلاط الدولية."
                ),
                type("Temple", "معبد"),
                "temple",
                "c. 380 BCE-3rd century CE",
                text("Ptolemaic and Roman rulers devoted to Isis", "حكام بطالمة ورومان كرسوا المعبد لإيزيس"),
                -380,
                53.0,
                74.0,
                List.of(
                    fact("Era / Kingdom", "Late Period to Ptolemaic and Roman eras", "العصر / المملكة", "العصر المتأخر ثم البطلمي والروماني"),
                    fact("Location", "Philae, Aswan", "الموقع", "فيلة، أسوان"),
                    fact("Type", "Island temple complex", "النوع", "مجمع معابد جزيري"),
                    fact("Approximate date", "c. 380 BCE-3rd century CE", "التاريخ التقريبي", "حوالي 380 ق.م إلى القرن الثالث الميلادي"),
                    fact("Related historical figures", "Ptolemaic rulers and priests of Isis", "الشخصيات التاريخية المرتبطة", "الحكام البطالمة وكهنة إيزيس"),
                    fact("Known for", "Cult of Isis and modern rescue relocation", "أشهر ما يميزه", "عبادة إيزيس وعمليات الإنقاذ الحديثة")
                ),
                List.of("abu-simbel"),
                images(
                    imagePath("temple of phila.jpg"),
                    imagePath("temple of philea.jpg")
                )
            )
        );
    }

    private static Monument monument(
        String slug,
        Map<String, String> name,
        Map<String, String> subtitle,
        Map<String, String> shortDescription,
        Map<String, String> overview,
        Map<String, String> historicalBackground,
        Map<String, String> whyItMatters,
        Map<String, String> funFact,
        Map<String, String> story,
        Map<String, String> location,
        String locationKey,
        Map<String, String> era,
        String eraKey,
        Map<String, String> eraSummary,
        Map<String, String> type,
        String typeKey,
        String approximateDate,
        Map<String, String> relatedFigure,
        int periodOrder,
        double mapX,
        double mapY,
        List<Map<String, String>> facts,
        List<String> relatedSlugs,
        List<String> images
    ) {
        return new Monument(
            slug,
            name,
            subtitle,
            shortDescription,
            overview,
            historicalBackground,
            whyItMatters,
            funFact,
            story,
            location,
            locationKey,
            era,
            eraKey,
            eraSummary,
            type,
            typeKey,
            approximateDate,
            relatedFigure,
            periodOrder,
            mapX,
            mapY,
            facts,
            relatedSlugs,
            images
        );
    }

    private static Map<String, String> text(String en, String ar) {
        return Map.of("en", en, "ar", ar);
    }

    private static Map<String, String> era(String en, String ar) {
        return text(en, ar);
    }

    private static Map<String, String> type(String en, String ar) {
        return text(en, ar);
    }

    private static Map<String, String> fact(String labelEn, String valueEn, String labelAr, String valueAr) {
        return Map.of(
            "labelEn", labelEn,
            "valueEn", valueEn,
            "labelAr", labelAr,
            "valueAr", valueAr
        );
    }

    private static List<String> images(String primary, String secondary) {
        return List.of(primary, secondary);
    }

    private static String imagePath(String filename) {
        return "/img/" + filename;
    }
}
