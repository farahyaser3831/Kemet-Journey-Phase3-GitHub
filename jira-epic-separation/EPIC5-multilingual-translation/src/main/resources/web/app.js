const FALLBACK_IMAGE = "/placeholder.svg";

const translations = {
    en: {
        nav: { home: "Home", explore: "Monuments of Eternity", timeline: "Legacy of Pharaohs", regions: "Journey Along the Nile", exhibit: "Digital Exhibit" },
        hero: {
            eyebrow: "Kemet Journey",
            title: "Walk Among the Monuments of Kings and Gods.",
            description: "From the Great Pyramids of Giza to the hidden tombs of the Valley of the Kings, experience history through a curated digital journey of Egypt's most iconic landmarks.",
            primaryCta: "Begin the journey",
            secondaryCta: "Trace the timeline",
            surfaceLabel: "Traveler archive",
            surfaceTitle: "Create your own path through Egypt's greatest monuments.",
            surfaceText: "Sign in with a simple traveler profile and keep your favorites connected to you on this device."
        },
        explore: {
            eyebrow: "Monuments of Eternity",
            title: "Search the sacred landscape",
            description: "Explore pyramids, temples, statues, chapels, and royal burial sites through a catalog designed like a modern museum guide to ancient Egypt.",
            searchLabel: "Search by monument, location, era, type, or historical keyword",
            resultsSuffix: "monuments in view"
        },
        filters: {
            era: "Era",
            type: "Type",
            location: "Location",
            clear: "Clear filters",
            allEras: "All eras",
            allTypes: "All types",
            allLocations: "All locations"
        },
        favorites: {
            title: "Favorites",
            eyebrow: "Treasures of Kemet",
            heading: "Your saved collection",
            description: "Keep a personal trail of monuments, objects, and sacred sites you want to revisit.",
            filter: "Show favorites only",
            emptyTitle: "No favorites saved yet",
            emptyDescription: "Use the star icon on any monument to build your own collection."
        },
        empty: {
            title: "No monuments found",
            description: "Try another era, location, or keyword."
        },
        details: {
            eyebrow: "Museum-style exhibit",
            overview: "Overview",
            history: "Historical Background",
            matter: "Why It Matters",
            funFact: "Fun Fact",
            factsTitle: "Key Facts",
            save: "Save to favorites",
            remove: "Remove from favorites"
        },
        timeline: {
            eyebrow: "Legacy of Pharaohs",
            title: "A historical timeline of Egyptian landmarks",
            description: "Follow Egyptian monuments through the Old Kingdom, Middle Kingdom, New Kingdom, Amarna, and the later sacred world of the Ptolemies."
        },
        map: {
            eyebrow: "Journey Along the Nile",
            title: "Explore by region",
            description: "Use the stylized map and clickable regional stations to move through Giza, Luxor, Aswan, Amarna, and Cairo."
        },
        stats: {
            monuments: "Landmarks",
            eras: "Historical eras",
            routes: "Curated routes"
        },
        buttons: {
            open: "View details",
            filterRegion: "Explore region"
        },
        auth: {
            guest: "Sign In",
            profile: "Traveler",
            eyebrow: "Traveler profile",
            title: "Personalize your Kemet Journey",
            description: "Save a simple profile name to keep favorites tied to you on this browser.",
            nameLabel: "Profile name",
            passwordLabel: "Password",
            placeholder: "Enter your name",
            passwordPlaceholder: "Enter your password",
            save: "Sign in / Create profile",
            logout: "Log out",
            close: "Close",
            invalid: "Enter a valid name to create your traveler profile.",
            invalidPassword: "Enter a password to continue.",
            passwordMismatch: "Incorrect password for this profile.",
            duplicate: "This profile name already exists. Please choose another name.",
            favoriteRequired: "Sign in first to save monuments to your favorites.",
            saved: "Profile saved. Your favorites now belong to this traveler.",
            savedFavorite: "Profile saved, and the monument was added to your favorites.",
            signedIn: "Signed in to your existing profile.",
            signedInFavorite: "Signed in, and the monument was added to your favorites.",
            loggedOut: "Signed out. You are browsing as a guest."
        }
    },
    ar: {
        nav: { home: "الرئيسية", explore: "آثار الخلود", timeline: "إرث الفراعنة", regions: "رحلة على امتداد النيل", exhibit: "المعرض الرقمي" },
        hero: {
            eyebrow: "كِمِت جورني",
            title: "سر بين آثار الملوك والآلهة.",
            description: "من أهرامات الجيزة العظيمة إلى المقابر الخفية في وادي الملوك، عِش التاريخ عبر رحلة رقمية منتقاة تضم أشهر معالم مصر القديمة.",
            primaryCta: "ابدأ الرحلة",
            secondaryCta: "تتبع الخط الزمني",
            surfaceLabel: "أرشيف المسافر",
            surfaceTitle: "أنشئ مسارك الخاص عبر أعظم آثار مصر.",
            surfaceText: "سجّل باسم مسافر بسيط ليبقى سجل المفضلة مرتبطًا بك على هذا الجهاز."
        },
        explore: {
            eyebrow: "آثار الخلود",
            title: "ابحث في المشهد المقدس",
            description: "استكشف الأهرامات والمعابد والتماثيل والمقاصير والجبانات الملكية من خلال فهرس صُمم كدليل متحفي معاصر لمصر القديمة.",
            searchLabel: "ابحث باسم الأثر أو الموقع أو العصر أو النوع أو كلمة تاريخية",
            resultsSuffix: "أثرًا معروضًا"
        },
        filters: {
            era: "العصر",
            type: "النوع",
            location: "الموقع",
            clear: "مسح الفلاتر",
            allEras: "كل العصور",
            allTypes: "كل الأنواع",
            allLocations: "كل المواقع"
        },
        favorites: {
            title: "المفضلة",
            eyebrow: "كنوز كِمِت",
            heading: "مجموعتك المحفوظة",
            description: "احتفظ بمسار شخصي من الآثار والقطع والمواقع المقدسة التي تريد العودة إليها.",
            filter: "عرض المفضلة فقط",
            emptyTitle: "لا توجد عناصر محفوظة بعد",
            emptyDescription: "استخدم أيقونة النجمة على أي أثر لبناء مجموعتك الخاصة."
        },
        empty: {
            title: "لا توجد آثار مطابقة",
            description: "جرّب عصرًا أو موقعًا أو كلمة مختلفة."
        },
        details: {
            eyebrow: "عرض متحفي رقمي",
            overview: "نظرة عامة",
            history: "الخلفية التاريخية",
            matter: "لماذا يهم",
            funFact: "معلومة مميزة",
            factsTitle: "حقائق أساسية",
            save: "حفظ في المفضلة",
            remove: "إزالة من المفضلة"
        },
        timeline: {
            eyebrow: "إرث الفراعنة",
            title: "خط زمني تاريخي للمعالم المصرية",
            description: "تتبع المعالم المصرية عبر الدولة القديمة والدولة الوسطى والدولة الحديثة وعصر العمارنة والعالم المقدس المتأخر للبطالمة."
        },
        map: {
            eyebrow: "رحلة على امتداد النيل",
            title: "استكشف حسب الإقليم",
            description: "استخدم الخريطة المصممة بعناية والمحطات الإقليمية القابلة للنقر للتنقل بين الجيزة والأقصر وأسوان والعمارنة والقاهرة."
        },
        stats: {
            monuments: "معالم",
            eras: "عصور تاريخية",
            routes: "مسارات منتقاة"
        },
        buttons: {
            open: "عرض التفاصيل",
            filterRegion: "استكشف الإقليم"
        },
        auth: {
            guest: "تسجيل الدخول",
            profile: "المسافر",
            eyebrow: "ملف المسافر",
            title: "خصص رحلتك مع كِمِت جورني",
            description: "احفظ اسم ملف بسيطًا ليبقى سجل المفضلة مرتبطًا بك على هذا المتصفح.",
            nameLabel: "اسم الملف",
            passwordLabel: "كلمة المرور",
            placeholder: "أدخل اسمك",
            passwordPlaceholder: "أدخل كلمة المرور",
            save: "تسجيل الدخول / إنشاء ملف",
            logout: "تسجيل الخروج",
            close: "إغلاق",
            invalid: "أدخل اسمًا صحيحًا لإنشاء ملف المسافر.",
            invalidPassword: "أدخل كلمة مرور للمتابعة.",
            passwordMismatch: "كلمة المرور غير صحيحة لهذا الملف.",
            duplicate: "اسم الملف هذا موجود بالفعل. الرجاء اختيار اسم آخر.",
            favoriteRequired: "سجّل الدخول أولًا لحفظ الآثار في المفضلة.",
            saved: "تم حفظ الملف، وأصبحت المفضلة مرتبطة بهذا المسافر.",
            savedFavorite: "تم حفظ الملف، وتمت إضافة الأثر إلى المفضلة.",
            signedIn: "تم تسجيل الدخول إلى ملفك الموجود.",
            signedInFavorite: "تم تسجيل الدخول، وتمت إضافة الأثر إلى المفضلة.",
            loggedOut: "تم تسجيل الخروج، وأنت الآن تتصفح كزائر."
        }
    }
};

const state = {
    language: localStorage.getItem("kemet-language") || "en",
    currentUser: localStorage.getItem("kemet-user") || "",
    favorites: new Set(),
    catalog: [],
    monuments: [],
    meta: { eras: [], types: [], locations: [], timelineGroups: [], regions: [] },
    selectedSlug: null,
    selectedMonument: null,
    pendingFavoriteSlug: null,
    favoritesOnly: false,
    filters: { search: "", era: "", type: "", location: "" }
};

const regionPositions = {
    giza: { left: "41%", top: "21%" },
    cairo: { left: "46%", top: "28%" },
    luxor: { left: "50%", top: "47%" },
    amarna: { left: "45%", top: "39%" },
    aswan: { left: "55%", top: "73%" }
};

const elements = {
    languageButton: document.querySelector("#languageButton"),
    favoritesButton: document.querySelector("#favoritesButton"),
    favoritesCount: document.querySelector("#favoritesCount"),
    favoritesOnlyButton: document.querySelector("#favoritesOnlyButton"),
    authButton: document.querySelector("#authButton"),
    favoritesGrid: document.querySelector("#favoritesGrid"),
    favoritesEmpty: document.querySelector("#favoritesEmpty"),
    monumentsGrid: document.querySelector("#monumentsGrid"),
    emptyState: document.querySelector("#emptyState"),
    searchInput: document.querySelector("#searchInput"),
    eraFilter: document.querySelector("#eraFilter"),
    typeFilter: document.querySelector("#typeFilter"),
    locationFilter: document.querySelector("#locationFilter"),
    clearFiltersButton: document.querySelector("#clearFiltersButton"),
    resultsCount: document.querySelector("#resultsCount"),
    heroStats: document.querySelector("#heroStats"),
    detailName: document.querySelector("#detailName"),
    detailSubtitle: document.querySelector("#detailSubtitle"),
    detailOverview: document.querySelector("#detailOverview"),
    detailHistory: document.querySelector("#detailHistory"),
    detailSignificance: document.querySelector("#detailSignificance"),
    detailFunFact: document.querySelector("#detailFunFact"),
    detailMeta: document.querySelector("#detailMeta"),
    detailFacts: document.querySelector("#detailFacts"),
    detailGallery: document.querySelector("#detailGallery"),
    detailFavoriteButton: document.querySelector("#detailFavoriteButton"),
    timelineRail: document.querySelector("#timelineRail"),
    egyptMap: document.querySelector("#egyptMap"),
    regionList: document.querySelector("#regionList"),
    monumentCardTemplate: document.querySelector("#monumentCardTemplate"),
    authModal: document.querySelector("#authModal"),
    authNameInput: document.querySelector("#authNameInput"),
    authPasswordInput: document.querySelector("#authPasswordInput"),
    saveProfileButton: document.querySelector("#saveProfileButton"),
    logoutButton: document.querySelector("#logoutButton"),
    authStatus: document.querySelector("#authStatus")
};

document.addEventListener("DOMContentLoaded", init);

async function init() {
    state.favorites = loadFavorites();
    registerCurrentProfile();
    bindEvents();
    applyTranslations();
    await Promise.all([loadMeta(), loadCatalog()]);
    updateFilteredMonuments();
    renderAll();
}

function bindEvents() {
    elements.languageButton.addEventListener("click", () => {
        state.language = state.language === "en" ? "ar" : "en";
        localStorage.setItem("kemet-language", state.language);
        applyTranslations();
        renderAll();
    });

    elements.searchInput.addEventListener("input", (event) => {
        state.filters.search = event.target.value.trim();
        updateFilteredMonuments();
        renderAll();
    });

    elements.eraFilter.addEventListener("change", (event) => {
        state.filters.era = event.target.value;
        updateFilteredMonuments();
        renderAll();
    });

    elements.typeFilter.addEventListener("change", (event) => {
        state.filters.type = event.target.value;
        updateFilteredMonuments();
        renderAll();
    });

    elements.locationFilter.addEventListener("change", (event) => {
        state.filters.location = event.target.value;
        updateFilteredMonuments();
        renderAll();
    });

    elements.clearFiltersButton.addEventListener("click", () => {
        state.filters = { search: "", era: "", type: "", location: "" };
        state.favoritesOnly = false;
        elements.searchInput.value = "";
        elements.eraFilter.value = "";
        elements.typeFilter.value = "";
        elements.locationFilter.value = "";
        updateFilteredMonuments();
        renderAll();
    });

    elements.favoritesButton.addEventListener("click", () => {
        document.querySelector("#favoritesSection").scrollIntoView({ behavior: "smooth", block: "start" });
    });

    elements.favoritesOnlyButton.addEventListener("click", () => {
        state.favoritesOnly = !state.favoritesOnly;
        renderAll();
    });

    elements.authButton.addEventListener("click", () => {
        state.pendingFavoriteSlug = null;
        elements.authNameInput.value = state.currentUser;
        elements.authPasswordInput.value = "";
        elements.authStatus.textContent = "";
        elements.authModal.showModal();
    });

    elements.saveProfileButton.addEventListener("click", saveProfile);
    elements.logoutButton.addEventListener("click", logoutProfile);
    elements.authModal.addEventListener("close", () => {
        if (!state.currentUser) {
            state.pendingFavoriteSlug = null;
        }
    });
}

async function loadMeta() {
    const response = await fetch("/api/meta");
    state.meta = await response.json();
    populateFilters();
}

async function loadCatalog() {
    const response = await fetch("/api/monuments");
    const data = await response.json();
    state.catalog = data.items || [];
}

function updateFilteredMonuments() {
    const search = normalize(state.filters.search);
    state.monuments = state.catalog.filter((item) => {
        const matchesSearch = !search
            || [
                getBoth(item.name),
                getBoth(item.shortDescription),
                getBoth(item.subtitle),
                getBoth(item.location),
                getBoth(item.era),
                getBoth(item.type),
                getBoth(item.relatedFigure),
                item.approximateDate || ""
            ].some((value) => normalize(value).includes(search));

        return (!state.filters.era || item.eraKey === state.filters.era)
            && (!state.filters.type || item.typeKey === state.filters.type)
            && (!state.filters.location || item.locationKey === state.filters.location)
            && matchesSearch;
    });

    if (!state.selectedSlug && state.monuments[0]) {
        selectMonument(state.monuments[0].slug, false);
    } else if (state.selectedSlug && !state.monuments.some((item) => item.slug === state.selectedSlug)) {
        const fallback = state.monuments[0];
        if (fallback) {
            selectMonument(fallback.slug, false);
        }
    }
}

async function selectMonument(slug, scroll = true) {
    try {
        const response = await fetch(`/api/monuments/${slug}`);
        if (!response.ok) {
            return;
        }
        state.selectedSlug = slug;
        state.selectedMonument = await response.json();
        renderSelectedDetail();
        if (scroll) {
            document.querySelector("#details").scrollIntoView({ behavior: "smooth", block: "start" });
        }
    } catch (error) {
        console.error(error);
    }
}

function renderAll() {
    applyTranslations();
    renderHero();
    renderMonuments();
    renderFavorites();
    renderTimeline();
    renderMap();
    renderSelectedDetail();
    renderFavoritesCount();
}

function renderHero() {
    const current = t();
    elements.heroStats.innerHTML = [
        statCard(state.catalog.length, current.stats.monuments),
        statCard(state.meta.timelineGroups.length, current.stats.eras),
        statCard(state.meta.regions.length, current.stats.routes)
    ].join("");
    elements.languageButton.textContent = state.language === "en" ? "AR" : "EN";
    elements.authButton.textContent = state.currentUser
        ? `${current.auth.profile}: ${state.currentUser}`
        : current.auth.guest;
    elements.logoutButton.classList.toggle("hidden", !state.currentUser);
}

function renderMonuments() {
    const items = getVisibleMonuments();
    elements.monumentsGrid.innerHTML = "";
    elements.resultsCount.textContent = String(items.length);
    elements.emptyState.classList.toggle("hidden", items.length > 0);
    elements.favoritesOnlyButton.classList.toggle("is-active", state.favoritesOnly);
    items.forEach((item) => {
        elements.monumentsGrid.appendChild(createMonumentCard(item));
    });
}

function renderFavorites() {
    const items = state.catalog.filter((item) => state.favorites.has(item.slug));
    elements.favoritesGrid.innerHTML = "";
    elements.favoritesEmpty.classList.toggle("hidden", items.length > 0);
    items.forEach((item) => {
        elements.favoritesGrid.appendChild(createMonumentCard(item));
    });
}

function createMonumentCard(item) {
    const node = elements.monumentCardTemplate.content.firstElementChild.cloneNode(true);
    const image = node.querySelector(".monument-image");
    image.src = item.thumbnail || FALLBACK_IMAGE;
    image.alt = getText(item.name);
    image.onerror = () => {
        image.onerror = null;
        image.src = FALLBACK_IMAGE;
    };

    node.querySelector(".monument-era").textContent = getText(item.era);
    node.querySelector(".monument-title").textContent = getText(item.name);
    node.querySelector(".monument-description").textContent = getText(item.shortDescription);
    node.querySelector(".monument-location").textContent = getText(item.location);
    node.querySelector(".monument-type").textContent = getText(item.type);
    node.querySelector(".monument-date").textContent = item.approximateDate || "";

    const favoriteButton = node.querySelector(".favorite-toggle");
    favoriteButton.classList.toggle("is-active", state.favorites.has(item.slug));
    favoriteButton.textContent = state.favorites.has(item.slug) ? "★" : "☆";
    favoriteButton.addEventListener("click", () => toggleFavorite(item.slug));

    const openButton = node.querySelector(".monument-open");
    openButton.textContent = t().buttons.open;
    openButton.addEventListener("click", () => selectMonument(item.slug));
    return node;
}

function renderSelectedDetail() {
    const item = state.selectedMonument;
    if (!item) {
        return;
    }

    elements.detailName.textContent = getText(item.name);
    elements.detailSubtitle.textContent = getText(item.shortDescription || item.subtitle);
    elements.detailOverview.textContent = getText(item.overview);
    elements.detailHistory.textContent = getText(item.historicalBackground);
    elements.detailSignificance.textContent = getText(item.whyItMatters);
    elements.detailFunFact.textContent = getText(item.funFact);

    elements.detailGallery.innerHTML = (item.images || [])
        .map((src) => `<img src="${src || FALLBACK_IMAGE}" alt="${escapeHtml(getText(item.name))}">`)
        .join("");
    elements.detailGallery.querySelectorAll("img").forEach((image) => {
        image.onerror = () => {
            image.onerror = null;
            image.src = FALLBACK_IMAGE;
        };
    });

    elements.detailMeta.innerHTML = [
        chip(getText(item.location)),
        chip(getText(item.era)),
        chip(getText(item.type)),
        chip(item.approximateDate || ""),
        chip(getText(item.relatedFigure))
    ].join("");

    elements.detailFacts.innerHTML = (item.facts || [])
        .map((fact) => {
            const label = state.language === "ar" ? fact.labelAr : fact.labelEn;
            const value = state.language === "ar" ? fact.valueAr : fact.valueEn;
            return `<div class="fact-row"><strong>${escapeHtml(label)}</strong><span>${escapeHtml(value)}</span></div>`;
        })
        .join("");

    const favorite = state.favorites.has(item.slug);
    elements.detailFavoriteButton.textContent = favorite ? t().details.remove : t().details.save;
    elements.detailFavoriteButton.classList.toggle("is-active", favorite);
    elements.detailFavoriteButton.onclick = () => toggleFavorite(item.slug);
}

function renderTimeline() {
    elements.timelineRail.innerHTML = (state.meta.timelineGroups || [])
        .map((group) => `
            <section class="timeline-era">
                <div class="timeline-era-header">
                    <span class="chip">${escapeHtml(getText(group.label))}</span>
                    <h3>${escapeHtml(getText(group.label))}</h3>
                    <p>${escapeHtml(getText(group.summary))}</p>
                </div>
                ${(group.items || []).map((item) => `
                    <article class="timeline-entry">
                        <strong class="timeline-date">${escapeHtml(item.approximateDate || "")}</strong>
                        <div>
                            <h4>${escapeHtml(getText(item.name))}</h4>
                            <p>${escapeHtml(getText(item.shortDescription))}</p>
                        </div>
                        <button class="secondary-button" type="button" data-slug="${item.slug}">
                            ${escapeHtml(t().buttons.open)}
                        </button>
                    </article>
                `).join("")}
            </section>
        `)
        .join("");

    elements.timelineRail.querySelectorAll("button").forEach((button) => {
        button.addEventListener("click", () => selectMonument(button.dataset.slug));
    });
}

function renderMap() {
    elements.egyptMap.querySelectorAll(".region-hotspot").forEach((node) => node.remove());
    elements.regionList.innerHTML = "";

    (state.meta.regions || []).forEach((region) => {
        const hotspot = document.createElement("button");
        hotspot.type = "button";
        hotspot.className = "region-hotspot";
        hotspot.textContent = getText(region.label);
        hotspot.dataset.location = region.key;
        hotspot.classList.toggle("is-active", state.filters.location === region.key);
        const position = regionPositions[region.key] || { left: "48%", top: "50%" };
        hotspot.style.left = position.left;
        hotspot.style.top = position.top;
        hotspot.addEventListener("click", () => applyLocationFilter(region.key));
        elements.egyptMap.appendChild(hotspot);

        const card = document.createElement("article");
        card.className = "region-card";
        card.innerHTML = `
            <div class="region-card-header">
                <div>
                    <h3>${escapeHtml(getText(region.label))}</h3>
                    <p>${escapeHtml(region.items.length)} ${escapeHtml(t().explore.resultsSuffix)}</p>
                </div>
                <button class="secondary-button" type="button" data-location="${region.key}">
                    ${escapeHtml(t().buttons.filterRegion)}
                </button>
            </div>
            <ul>
                ${(region.items || []).map((item) => `<li>${escapeHtml(getText(item.name))}</li>`).join("")}
            </ul>
        `;
        card.querySelector("button").addEventListener("click", () => applyLocationFilter(region.key));
        elements.regionList.appendChild(card);
    });
}

function applyLocationFilter(locationKey) {
    state.filters.location = locationKey;
    elements.locationFilter.value = locationKey;
    updateFilteredMonuments();
    renderAll();
    document.querySelector("#explore").scrollIntoView({ behavior: "smooth", block: "start" });
}

function populateFilters() {
    fillSelect(elements.eraFilter, state.meta.eras || [], t().filters.allEras);
    fillSelect(elements.typeFilter, state.meta.types || [], t().filters.allTypes);
    fillSelect(elements.locationFilter, state.meta.locations || [], t().filters.allLocations);
}

function fillSelect(select, values, defaultLabel) {
    const currentValue = select.value;
    select.innerHTML = [`<option value="">${escapeHtml(defaultLabel)}</option>`]
        .concat(values.map((value) => `<option value="${escapeHtml(value)}">${escapeHtml(humanize(value))}</option>`))
        .join("");
    select.value = currentValue || state.filters[select.id.replace("Filter", "").toLowerCase()] || "";
}

function getVisibleMonuments() {
    return state.favoritesOnly
        ? state.monuments.filter((item) => state.favorites.has(item.slug))
        : state.monuments;
}

function getBoth(value) {
    if (!value) {
        return "";
    }
    return `${value.en || ""} ${value.ar || ""}`;
}

function normalize(value) {
    return String(value || "").trim().toLowerCase();
}

function toggleFavorite(slug) {
    if (!state.currentUser) {
        requireLoginForFavorites(slug);
        return;
    }

    if (state.favorites.has(slug)) {
        state.favorites.delete(slug);
    } else {
        state.favorites.add(slug);
    }
    persistFavorites();
    renderMonuments();
    renderFavorites();
    renderFavoritesCount();
    renderSelectedDetail();
}

function requireLoginForFavorites(slug) {
    state.pendingFavoriteSlug = slug;
    elements.authNameInput.value = "";
    elements.authPasswordInput.value = "";
    elements.authStatus.textContent = t().auth.favoriteRequired;
    if (!elements.authModal.open) {
        elements.authModal.showModal();
    }
    elements.authNameInput.focus();
}

function renderFavoritesCount() {
    elements.favoritesCount.textContent = String(state.favorites.size);
}

function applyTranslations() {
    document.documentElement.lang = state.language;
    document.body.dir = state.language === "ar" ? "rtl" : "ltr";

    document.querySelectorAll("[data-i18n]").forEach((node) => {
        node.textContent = resolveKey(t(), node.dataset.i18n);
    });

    elements.searchInput.placeholder = t().explore.searchLabel;
    elements.authNameInput.placeholder = t().auth.placeholder;
    elements.authPasswordInput.placeholder = t().auth.passwordPlaceholder;
    populateFilters();
}

function getText(value) {
    if (!value) {
        return "";
    }
    return value[state.language] || value.en || "";
}

function resolveKey(source, path) {
    return path.split(".").reduce((acc, segment) => acc?.[segment], source) || "";
}

function t() {
    return translations[state.language];
}

function humanize(value) {
    if (state.language === "ar") {
        return {
            giza: "الجيزة",
            cairo: "القاهرة",
            luxor: "الأقصر",
            amarna: "العمارنة",
            aswan: "أسوان",
            "old-kingdom": "الدولة القديمة",
            "middle-kingdom": "الدولة الوسطى",
            "new-kingdom": "الدولة الحديثة",
            "amarna-period": "عصر العمارنة",
            "ptolemaic-period": "العصر البطلمي",
            pyramid: "هرم",
            statue: "تمثال",
            temple: "معبد",
            necropolis: "جبانة",
            artifact: "أثر",
            chapel: "مقصورة"
        }[value] || value;
    }

    return value
        .split("-")
        .map((part) => part.charAt(0).toUpperCase() + part.slice(1))
        .join(" ");
}

function statCard(value, label) {
    return `<div class="stat"><strong>${value}</strong><span>${escapeHtml(label)}</span></div>`;
}

function chip(label) {
    if (!label) {
        return "";
    }
    return `<span class="chip">${escapeHtml(label)}</span>`;
}

function profileNamesStorageKey() {
    return "kemet-profile-names";
}

function normalizeProfileName(name) {
    return String(name || "").trim().toLowerCase();
}

function loadProfileNames() {
    try {
        const stored = localStorage.getItem(profileNamesStorageKey()) || "[]";
        return new Set(JSON.parse(stored).map(normalizeProfileName).filter(Boolean));
    } catch (error) {
        return new Set();
    }
}

function persistProfileNames(profileNames) {
    localStorage.setItem(profileNamesStorageKey(), JSON.stringify([...profileNames]));
}

function profilePasswordsStorageKey() {
    return "kemet-profile-passwords";
}

function loadProfilePasswords() {
    try {
        return JSON.parse(localStorage.getItem(profilePasswordsStorageKey()) || "{}");
    } catch (error) {
        return {};
    }
}

function persistProfilePasswords(profilePasswords) {
    localStorage.setItem(profilePasswordsStorageKey(), JSON.stringify(profilePasswords));
}

function profileHasPassword(name) {
    const normalized = normalizeProfileName(name);
    const profilePasswords = loadProfilePasswords();
    return Boolean(normalized && profilePasswords[normalized]);
}

function profilePasswordMatches(name, password) {
    const normalized = normalizeProfileName(name);
    const profilePasswords = loadProfilePasswords();
    return Boolean(normalized && profilePasswords[normalized] === password);
}

function setProfilePassword(name, password) {
    const normalized = normalizeProfileName(name);
    if (!normalized) {
        return;
    }

    const profilePasswords = loadProfilePasswords();
    profilePasswords[normalized] = password;
    persistProfilePasswords(profilePasswords);
}

function profileNameExists(name) {
    const normalized = normalizeProfileName(name);
    if (!normalized) {
        return false;
    }

    return loadProfileNames().has(normalized)
        || localStorage.getItem(`kemet-favorites:${normalized}`) !== null
        || profileHasPassword(normalized);
}

function registerProfileName(name) {
    const normalized = normalizeProfileName(name);
    if (!normalized) {
        return;
    }

    const profileNames = loadProfileNames();
    profileNames.add(normalized);
    persistProfileNames(profileNames);
}

function registerCurrentProfile() {
    registerProfileName(state.currentUser);
}

function favoritesStorageKey() {
    return state.currentUser
        ? `kemet-favorites:${state.currentUser.toLowerCase()}`
        : "kemet-favorites:guest";
}

function loadFavorites() {
    if (!state.currentUser) {
        return new Set();
    }

    try {
        const stored = localStorage.getItem(favoritesStorageKey()) || "[]";
        return new Set(JSON.parse(stored));
    } catch (error) {
        return new Set();
    }
}

function persistFavorites() {
    if (!state.currentUser) {
        return;
    }

    localStorage.setItem(favoritesStorageKey(), JSON.stringify([...state.favorites]));
}

function saveProfile() {
    const name = elements.authNameInput.value.trim();
    const password = elements.authPasswordInput.value;
    if (!name) {
        elements.authStatus.textContent = t().auth.invalid;
        return;
    }

    if (!password) {
        elements.authStatus.textContent = t().auth.invalidPassword;
        return;
    }

    const existingProfile = profileNameExists(name);
    const existingPassword = profileHasPassword(name);
    if (existingProfile && existingPassword && !profilePasswordMatches(name, password)) {
        elements.authStatus.textContent = t().auth.passwordMismatch;
        return;
    }

    if (existingProfile) {
        state.currentUser = name;
        localStorage.setItem("kemet-user", name);
        if (!existingPassword) {
            setProfilePassword(name, password);
        }
        state.favorites = loadFavorites();
        if (state.pendingFavoriteSlug) {
            state.favorites.add(state.pendingFavoriteSlug);
            state.pendingFavoriteSlug = null;
            persistFavorites();
            elements.authStatus.textContent = t().auth.signedInFavorite;
        } else {
            elements.authStatus.textContent = t().auth.signedIn;
        }
        renderAll();
        return;
    }

    state.currentUser = name;
    localStorage.setItem("kemet-user", name);
    registerProfileName(name);
    setProfilePassword(name, password);
    state.favorites = loadFavorites();
    if (state.pendingFavoriteSlug) {
        state.favorites.add(state.pendingFavoriteSlug);
        state.pendingFavoriteSlug = null;
        persistFavorites();
        elements.authStatus.textContent = t().auth.savedFavorite;
    } else {
        elements.authStatus.textContent = t().auth.saved;
    }
    renderAll();
}

function logoutProfile() {
    state.currentUser = "";
    localStorage.removeItem("kemet-user");
    state.favorites = loadFavorites();
    elements.authStatus.textContent = t().auth.loggedOut;
    renderAll();
}

function escapeHtml(value) {
    return String(value || "")
        .replaceAll("&", "&amp;")
        .replaceAll("<", "&lt;")
        .replaceAll(">", "&gt;")
        .replaceAll("\"", "&quot;")
        .replaceAll("'", "&#39;");
}
