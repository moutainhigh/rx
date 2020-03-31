package com.rx.extrx;

import com.rx.ext.annotation.ExtClass;
import com.rx.base.model.annotation.RxModelField;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ExtClass(alternateClassName="Rx.IconCls")
public enum IconCls{
	
	glass("x-fa fa-glass"),
	music("x-fa fa-music"),
	search("x-fa fa-search"),
	envelope_o("x-fa fa-envelope-o"),
	heart("x-fa fa-heart"),
	star("x-fa fa-star"),
	star_o("x-fa fa-star-o"),
	user("x-fa fa-user"),
	film("x-fa fa-film"),
	th_large("x-fa fa-th-large"),
	th("x-fa fa-th"),
	th_list("x-fa fa-th-list"),
	check("x-fa fa-check"),
	remove("x-fa fa-remove"),
	close("x-fa fa-close"),
	times("x-fa fa-times"),
	search_plus("x-fa fa-search-plus"),
	search_minus("x-fa fa-search-minus"),
	power_off("x-fa fa-power-off"),
	signal("x-fa fa-signal"),
	gear("x-fa fa-gear"),
	cog("x-fa fa-cog"),
	trash_o("x-fa fa-trash-o"),
	home("x-fa fa-home"),
	file_o("x-fa fa-file-o"),
	clock_o("x-fa fa-clock-o"),
	road("x-fa fa-road"),
	download("x-fa fa-download"),
	arrow_circle_o_down("x-fa fa-arrow-circle-o-down"),
	arrow_circle_o_up("x-fa fa-arrow-circle-o-up"),
	inbox("x-fa fa-inbox"),
	play_circle_o("x-fa fa-play-circle-o"),
	rotate_right("x-fa fa-rotate-right"),
	repeat("x-fa fa-repeat"),
	refresh("x-fa fa-refresh"),
	list_alt("x-fa fa-list-alt"),
	lock("x-fa fa-lock"),
	flag("x-fa fa-flag"),
	headphones("x-fa fa-headphones"),
	volume_off("x-fa fa-volume-off"),
	volume_down("x-fa fa-volume-down"),
	volume_up("x-fa fa-volume-up"),
	qrcode("x-fa fa-qrcode"),
	barcode("x-fa fa-barcode"),
	tag("x-fa fa-tag"),
	tags("x-fa fa-tags"),
	book("x-fa fa-book"),
	bookmark("x-fa fa-bookmark"),
	print("x-fa fa-print"),
	camera("x-fa fa-camera"),
	font("x-fa fa-font"),
	bold("x-fa fa-bold"),
	italic("x-fa fa-italic"),
	text_height("x-fa fa-text-height"),
	text_width("x-fa fa-text-width"),
	align_left("x-fa fa-align-left"),
	align_center("x-fa fa-align-center"),
	align_right("x-fa fa-align-right"),
	align_justify("x-fa fa-align-justify"),
	list("x-fa fa-list"),
	dedent("x-fa fa-dedent"),
	outdent("x-fa fa-outdent"),
	indent("x-fa fa-indent"),
	video_camera("x-fa fa-video-camera"),
	photo("x-fa fa-photo"),
	image("x-fa fa-image"),
	picture_o("x-fa fa-picture-o"),
	pencil("x-fa fa-pencil"),
	map_marker("x-fa fa-map-marker"),
	adjust("x-fa fa-adjust"),
	tint("x-fa fa-tint"),
	edit("x-fa fa-edit"),
	pencil_square_o("x-fa fa-pencil-square-o"),
	share_square_o("x-fa fa-share-square-o"),
	check_square_o("x-fa fa-check-square-o"),
	arrows("x-fa fa-arrows"),
	step_backward("x-fa fa-step-backward"),
	fast_backward("x-fa fa-fast-backward"),
	backward("x-fa fa-backward"),
	play("x-fa fa-play"),
	pause("x-fa fa-pause"),
	stop("x-fa fa-stop"),
	forward("x-fa fa-forward"),
	fast_forward("x-fa fa-fast-forward"),
	step_forward("x-fa fa-step-forward"),
	eject("x-fa fa-eject"),
	chevron_left("x-fa fa-chevron-left"),
	chevron_right("x-fa fa-chevron-right"),
	plus_circle("x-fa fa-plus-circle"),
	minus_circle("x-fa fa-minus-circle"),
	times_circle("x-fa fa-times-circle"),
	check_circle("x-fa fa-check-circle"),
	question_circle("x-fa fa-question-circle"),
	info_circle("x-fa fa-info-circle"),
	crosshairs("x-fa fa-crosshairs"),
	times_circle_o("x-fa fa-times-circle-o"),
	check_circle_o("x-fa fa-check-circle-o"),
	ban("x-fa fa-ban"),
	arrow_left("x-fa fa-arrow-left"),
	arrow_right("x-fa fa-arrow-right"),
	arrow_up("x-fa fa-arrow-up"),
	arrow_down("x-fa fa-arrow-down"),
	mail_forward("x-fa fa-mail-forward"),
	share("x-fa fa-share"),
	expand("x-fa fa-expand"),
	compress("x-fa fa-compress"),
	plus("x-fa fa-plus"),
	minus("x-fa fa-minus"),
	asterisk("x-fa fa-asterisk"),
	exclamation_circle("x-fa fa-exclamation-circle"),
	gift("x-fa fa-gift"),
	leaf("x-fa fa-leaf"),
	fire("x-fa fa-fire"),
	eye("x-fa fa-eye"),
	eye_slash("x-fa fa-eye-slash"),
	warning("x-fa fa-warning"),
	exclamation_triangle("x-fa fa-exclamation-triangle"),
	plane("x-fa fa-plane"),
	calendar("x-fa fa-calendar"),
	random("x-fa fa-random"),
	comment("x-fa fa-comment"),
	magnet("x-fa fa-magnet"),
	chevron_up("x-fa fa-chevron-up"),
	chevron_down("x-fa fa-chevron-down"),
	retweet("x-fa fa-retweet"),
	shopping_cart("x-fa fa-shopping-cart"),
	folder("x-fa fa-folder"),
	folder_open("x-fa fa-folder-open"),
	arrows_v("x-fa fa-arrows-v"),
	arrows_h("x-fa fa-arrows-h"),
	bar_chart_o("x-fa fa-bar-chart-o"),
	bar_chart("x-fa fa-bar-chart"),
	twitter_square("x-fa fa-twitter-square"),
	facebook_square("x-fa fa-facebook-square"),
	camera_retro("x-fa fa-camera-retro"),
	key("x-fa fa-key"),
	gears("x-fa fa-gears"),
	cogs("x-fa fa-cogs"),
	comments("x-fa fa-comments"),
	thumbs_o_up("x-fa fa-thumbs-o-up"),
	thumbs_o_down("x-fa fa-thumbs-o-down"),
	star_half("x-fa fa-star-half"),
	heart_o("x-fa fa-heart-o"),
	sign_out("x-fa fa-sign-out"),
	linkedin_square("x-fa fa-linkedin-square"),
	thumb_tack("x-fa fa-thumb-tack"),
	external_link("x-fa fa-external-link"),
	sign_in("x-fa fa-sign-in"),
	trophy("x-fa fa-trophy"),
	github_square("x-fa fa-github-square"),
	upload("x-fa fa-upload"),
	lemon_o("x-fa fa-lemon-o"),
	phone("x-fa fa-phone"),
	square_o("x-fa fa-square-o"),
	bookmark_o("x-fa fa-bookmark-o"),
	phone_square("x-fa fa-phone-square"),
	twitter("x-fa fa-twitter"),
	facebook_f("x-fa fa-facebook-f"),
	facebook("x-fa fa-facebook"),
	github("x-fa fa-github"),
	unlock("x-fa fa-unlock"),
	credit_card("x-fa fa-credit-card"),
	feed("x-fa fa-feed"),
	rss("x-fa fa-rss"),
	hdd_o("x-fa fa-hdd-o"),
	bullhorn("x-fa fa-bullhorn"),
	bell("x-fa fa-bell"),
	certificate("x-fa fa-certificate"),
	hand_o_right("x-fa fa-hand-o-right"),
	hand_o_left("x-fa fa-hand-o-left"),
	hand_o_up("x-fa fa-hand-o-up"),
	hand_o_down("x-fa fa-hand-o-down"),
	arrow_circle_left("x-fa fa-arrow-circle-left"),
	arrow_circle_right("x-fa fa-arrow-circle-right"),
	arrow_circle_up("x-fa fa-arrow-circle-up"),
	arrow_circle_down("x-fa fa-arrow-circle-down"),
	globe("x-fa fa-globe"),
	wrench("x-fa fa-wrench"),
	tasks("x-fa fa-tasks"),
	filter("x-fa fa-filter"),
	briefcase("x-fa fa-briefcase"),
	arrows_alt("x-fa fa-arrows-alt"),
	group("x-fa fa-group"),
	users("x-fa fa-users"),
	chain("x-fa fa-chain"),
	link("x-fa fa-link"),
	cloud("x-fa fa-cloud"),
	flask("x-fa fa-flask"),
	cut("x-fa fa-cut"),
	scissors("x-fa fa-scissors"),
	copy("x-fa fa-copy"),
	files_o("x-fa fa-files-o"),
	paperclip("x-fa fa-paperclip"),
	save("x-fa fa-save"),
	floppy_o("x-fa fa-floppy-o"),
	square("x-fa fa-square"),
	navicon("x-fa fa-navicon"),
	reorder("x-fa fa-reorder"),
	bars("x-fa fa-bars"),
	list_ul("x-fa fa-list-ul"),
	list_ol("x-fa fa-list-ol"),
	strikethrough("x-fa fa-strikethrough"),
	underline("x-fa fa-underline"),
	table("x-fa fa-table"),
	magic("x-fa fa-magic"),
	truck("x-fa fa-truck"),
	pinterest("x-fa fa-pinterest"),
	pinterest_square("x-fa fa-pinterest-square"),
	google_plus_square("x-fa fa-google-plus-square"),
	google_plus("x-fa fa-google-plus"),
	money("x-fa fa-money"),
	caret_down("x-fa fa-caret-down"),
	caret_up("x-fa fa-caret-up"),
	caret_left("x-fa fa-caret-left"),
	caret_right("x-fa fa-caret-right"),
	columns("x-fa fa-columns"),
	unsorted("x-fa fa-unsorted"),
	sort("x-fa fa-sort"),
	sort_down("x-fa fa-sort-down"),
	sort_desc("x-fa fa-sort-desc"),
	sort_up("x-fa fa-sort-up"),
	sort_asc("x-fa fa-sort-asc"),
	envelope("x-fa fa-envelope"),
	linkedin("x-fa fa-linkedin"),
	rotate_left("x-fa fa-rotate-left"),
	undo("x-fa fa-undo"),
	legal("x-fa fa-legal"),
	gavel("x-fa fa-gavel"),
	dashboard("x-fa fa-dashboard"),
	tachometer("x-fa fa-tachometer"),
	comment_o("x-fa fa-comment-o"),
	comments_o("x-fa fa-comments-o"),
	flash("x-fa fa-flash"),
	bolt("x-fa fa-bolt"),
	sitemap("x-fa fa-sitemap"),
	umbrella("x-fa fa-umbrella"),
	paste("x-fa fa-paste"),
	clipboard("x-fa fa-clipboard"),
	lightbulb_o("x-fa fa-lightbulb-o"),
	exchange("x-fa fa-exchange"),
	cloud_download("x-fa fa-cloud-download"),
	cloud_upload("x-fa fa-cloud-upload"),
	user_md("x-fa fa-user-md"),
	stethoscope("x-fa fa-stethoscope"),
	suitcase("x-fa fa-suitcase"),
	bell_o("x-fa fa-bell-o"),
	coffee("x-fa fa-coffee"),
	cutlery("x-fa fa-cutlery"),
	file_text_o("x-fa fa-file-text-o"),
	building_o("x-fa fa-building-o"),
	hospital_o("x-fa fa-hospital-o"),
	ambulance("x-fa fa-ambulance"),
	medkit("x-fa fa-medkit"),
	fighter_jet("x-fa fa-fighter-jet"),
	beer("x-fa fa-beer"),
	h_square("x-fa fa-h-square"),
	plus_square("x-fa fa-plus-square"),
	angle_double_left("x-fa fa-angle-double-left"),
	angle_double_right("x-fa fa-angle-double-right"),
	angle_double_up("x-fa fa-angle-double-up"),
	angle_double_down("x-fa fa-angle-double-down"),
	angle_left("x-fa fa-angle-left"),
	angle_right("x-fa fa-angle-right"),
	angle_up("x-fa fa-angle-up"),
	angle_down("x-fa fa-angle-down"),
	desktop("x-fa fa-desktop"),
	laptop("x-fa fa-laptop"),
	tablet("x-fa fa-tablet"),
	mobile_phone("x-fa fa-mobile-phone"),
	mobile("x-fa fa-mobile"),
	circle_o("x-fa fa-circle-o"),
	quote_left("x-fa fa-quote-left"),
	quote_right("x-fa fa-quote-right"),
	spinner("x-fa fa-spinner"),
	circle("x-fa fa-circle"),
	mail_reply("x-fa fa-mail-reply"),
	reply("x-fa fa-reply"),
	github_alt("x-fa fa-github-alt"),
	folder_o("x-fa fa-folder-o"),
	folder_open_o("x-fa fa-folder-open-o"),
	smile_o("x-fa fa-smile-o"),
	frown_o("x-fa fa-frown-o"),
	meh_o("x-fa fa-meh-o"),
	gamepad("x-fa fa-gamepad"),
	keyboard_o("x-fa fa-keyboard-o"),
	flag_o("x-fa fa-flag-o"),
	flag_checkered("x-fa fa-flag-checkered"),
	terminal("x-fa fa-terminal"),
	code_("x-fa fa-code"),
	mail_reply_all("x-fa fa-mail-reply-all"),
	reply_all("x-fa fa-reply-all"),
	star_half_empty("x-fa fa-star-half-empty"),
	star_half_full("x-fa fa-star-half-full"),
	star_half_o("x-fa fa-star-half-o"),
	location_arrow("x-fa fa-location-arrow"),
	crop("x-fa fa-crop"),
	code_fork("x-fa fa-code-fork"),
	unlink("x-fa fa-unlink"),
	chain_broken("x-fa fa-chain-broken"),
	question("x-fa fa-question"),
	info("x-fa fa-info"),
	exclamation("x-fa fa-exclamation"),
	superscript("x-fa fa-superscript"),
	subscript("x-fa fa-subscript"),
	eraser("x-fa fa-eraser"),
	puzzle_piece("x-fa fa-puzzle-piece"),
	microphone("x-fa fa-microphone"),
	microphone_slash("x-fa fa-microphone-slash"),
	shield("x-fa fa-shield"),
	calendar_o("x-fa fa-calendar-o"),
	fire_extinguisher("x-fa fa-fire-extinguisher"),
	rocket("x-fa fa-rocket"),
	maxcdn("x-fa fa-maxcdn"),
	chevron_circle_left("x-fa fa-chevron-circle-left"),
	chevron_circle_right("x-fa fa-chevron-circle-right"),
	chevron_circle_up("x-fa fa-chevron-circle-up"),
	chevron_circle_down("x-fa fa-chevron-circle-down"),
	anchor("x-fa fa-anchor"),
	unlock_alt("x-fa fa-unlock-alt"),
	bullseye("x-fa fa-bullseye"),
	ellipsis_h("x-fa fa-ellipsis-h"),
	ellipsis_v("x-fa fa-ellipsis-v"),
	rss_square("x-fa fa-rss-square"),
	play_circle("x-fa fa-play-circle"),
	ticket("x-fa fa-ticket"),
	minus_square("x-fa fa-minus-square"),
	minus_square_o("x-fa fa-minus-square-o"),
	level_up("x-fa fa-level-up"),
	level_down("x-fa fa-level-down"),
	check_square("x-fa fa-check-square"),
	pencil_square("x-fa fa-pencil-square"),
	external_link_square("x-fa fa-external-link-square"),
	share_square("x-fa fa-share-square"),
	compass("x-fa fa-compass"),
	toggle_down("x-fa fa-toggle-down"),
	caret_square_o_down("x-fa fa-caret-square-o-down"),
	toggle_up("x-fa fa-toggle-up"),
	caret_square_o_up("x-fa fa-caret-square-o-up"),
	toggle_right("x-fa fa-toggle-right"),
	caret_square_o_right("x-fa fa-caret-square-o-right"),
	euro("x-fa fa-euro"),
	eur("x-fa fa-eur"),
	gbp("x-fa fa-gbp"),
	dollar("x-fa fa-dollar"),
	usd("x-fa fa-usd"),
	rupee("x-fa fa-rupee"),
	inr("x-fa fa-inr"),
	cny("x-fa fa-cny"),
	rmb("x-fa fa-rmb"),
	yen("x-fa fa-yen"),
	jpy("x-fa fa-jpy"),
	ruble("x-fa fa-ruble"),
	rouble("x-fa fa-rouble"),
	rub("x-fa fa-rub"),
	won("x-fa fa-won"),
	krw("x-fa fa-krw"),
	bitcoin("x-fa fa-bitcoin"),
	btc("x-fa fa-btc"),
	file("x-fa fa-file"),
	file_text("x-fa fa-file-text"),
	sort_alpha_asc("x-fa fa-sort-alpha-asc"),
	sort_alpha_desc("x-fa fa-sort-alpha-desc"),
	sort_amount_asc("x-fa fa-sort-amount-asc"),
	sort_amount_desc("x-fa fa-sort-amount-desc"),
	sort_numeric_asc("x-fa fa-sort-numeric-asc"),
	sort_numeric_desc("x-fa fa-sort-numeric-desc"),
	thumbs_up("x-fa fa-thumbs-up"),
	thumbs_down("x-fa fa-thumbs-down"),
	youtube_square("x-fa fa-youtube-square"),
	youtube("x-fa fa-youtube"),
	xing("x-fa fa-xing"),
	xing_square("x-fa fa-xing-square"),
	youtube_play("x-fa fa-youtube-play"),
	dropbox("x-fa fa-dropbox"),
	stack_overflow("x-fa fa-stack-overflow"),
	instagram("x-fa fa-instagram"),
	flickr("x-fa fa-flickr"),
	adn("x-fa fa-adn"),
	bitbucket("x-fa fa-bitbucket"),
	bitbucket_square("x-fa fa-bitbucket-square"),
	tumblr("x-fa fa-tumblr"),
	tumblr_square("x-fa fa-tumblr-square"),
	long_arrow_down("x-fa fa-long-arrow-down"),
	long_arrow_up("x-fa fa-long-arrow-up"),
	long_arrow_left("x-fa fa-long-arrow-left"),
	long_arrow_right("x-fa fa-long-arrow-right"),
	apple("x-fa fa-apple"),
	windows("x-fa fa-windows"),
	android("x-fa fa-android"),
	linux("x-fa fa-linux"),
	dribbble("x-fa fa-dribbble"),
	skype("x-fa fa-skype"),
	foursquare("x-fa fa-foursquare"),
	trello("x-fa fa-trello"),
	female("x-fa fa-female"),
	male("x-fa fa-male"),
	gittip("x-fa fa-gittip"),
	gratipay("x-fa fa-gratipay"),
	sun_o("x-fa fa-sun-o"),
	moon_o("x-fa fa-moon-o"),
	archive("x-fa fa-archive"),
	bug("x-fa fa-bug"),
	vk("x-fa fa-vk"),
	weibo("x-fa fa-weibo"),
	renren("x-fa fa-renren"),
	pagelines("x-fa fa-pagelines"),
	stack_exchange("x-fa fa-stack-exchange"),
	arrow_circle_o_right("x-fa fa-arrow-circle-o-right"),
	arrow_circle_o_left("x-fa fa-arrow-circle-o-left"),
	toggle_left("x-fa fa-toggle-left"),
	caret_square_o_left("x-fa fa-caret-square-o-left"),
	dot_circle_o("x-fa fa-dot-circle-o"),
	wheelchair("x-fa fa-wheelchair"),
	vimeo_square("x-fa fa-vimeo-square"),
	turkish_lira("x-fa fa-turkish-lira"),
	try_("x-fa fa-try"),
	plus_square_o("x-fa fa-plus-square-o"),
	space_shuttle("x-fa fa-space-shuttle"),
	slack("x-fa fa-slack"),
	envelope_square("x-fa fa-envelope-square"),
	wordpress("x-fa fa-wordpress"),
	openid("x-fa fa-openid"),
	institution("x-fa fa-institution"),
	bank("x-fa fa-bank"),
	university("x-fa fa-university"),
	mortar_board("x-fa fa-mortar-board"),
	graduation_cap("x-fa fa-graduation-cap"),
	yahoo("x-fa fa-yahoo"),
	google("x-fa fa-google"),
	reddit("x-fa fa-reddit"),
	reddit_square("x-fa fa-reddit-square"),
	stumbleupon_circle("x-fa fa-stumbleupon-circle"),
	stumbleupon("x-fa fa-stumbleupon"),
	delicious("x-fa fa-delicious"),
	digg("x-fa fa-digg"),
	pied_piper("x-fa fa-pied-piper"),
	pied_piper_alt("x-fa fa-pied-piper-alt"),
	drupal("x-fa fa-drupal"),
	joomla("x-fa fa-joomla"),
	language("x-fa fa-language"),
	fax("x-fa fa-fax"),
	building("x-fa fa-building"),
	child("x-fa fa-child"),
	paw("x-fa fa-paw"),
	spoon("x-fa fa-spoon"),
	cube("x-fa fa-cube"),
	cubes("x-fa fa-cubes"),
	behance("x-fa fa-behance"),
	behance_square("x-fa fa-behance-square"),
	steam("x-fa fa-steam"),
	steam_square("x-fa fa-steam-square"),
	recycle("x-fa fa-recycle"),
	automobile("x-fa fa-automobile"),
	car("x-fa fa-car"),
	cab("x-fa fa-cab"),
	taxi("x-fa fa-taxi"),
	tree("x-fa fa-tree"),
	spotify("x-fa fa-spotify"),
	deviantart("x-fa fa-deviantart"),
	soundcloud("x-fa fa-soundcloud"),
	database("x-fa fa-database"),
	file_pdf_o("x-fa fa-file-pdf-o"),
	file_word_o("x-fa fa-file-word-o"),
	file_excel_o("x-fa fa-file-excel-o"),
	file_powerpoint_o("x-fa fa-file-powerpoint-o"),
	file_photo_o("x-fa fa-file-photo-o"),
	file_picture_o("x-fa fa-file-picture-o"),
	file_image_o("x-fa fa-file-image-o"),
	file_zip_o("x-fa fa-file-zip-o"),
	file_archive_o("x-fa fa-file-archive-o"),
	file_sound_o("x-fa fa-file-sound-o"),
	file_audio_o("x-fa fa-file-audio-o"),
	file_movie_o("x-fa fa-file-movie-o"),
	file_video_o("x-fa fa-file-video-o"),
	file_code_o("x-fa fa-file-code-o"),
	vine("x-fa fa-vine"),
	codepen("x-fa fa-codepen"),
	jsfiddle("x-fa fa-jsfiddle"),
	life_bouy("x-fa fa-life-bouy"),
	life_buoy("x-fa fa-life-buoy"),
	life_saver("x-fa fa-life-saver"),
	support("x-fa fa-support"),
	life_ring("x-fa fa-life-ring"),
	circle_o_notch("x-fa fa-circle-o-notch"),
	ra("x-fa fa-ra"),
	rebel("x-fa fa-rebel"),
	ge("x-fa fa-ge"),
	empire("x-fa fa-empire"),
	git_square("x-fa fa-git-square"),
	git("x-fa fa-git"),
	y_combinator_square("x-fa fa-y-combinator-square"),
	yc_square("x-fa fa-yc-square"),
	hacker_news("x-fa fa-hacker-news"),
	tencent_weibo("x-fa fa-tencent-weibo"),
	qq("x-fa fa-qq"),
	wechat("x-fa fa-wechat"),
	weixin("x-fa fa-weixin"),
	send("x-fa fa-send"),
	paper_plane("x-fa fa-paper-plane"),
	send_o("x-fa fa-send-o"),
	paper_plane_o("x-fa fa-paper-plane-o"),
	history("x-fa fa-history"),
	circle_thin("x-fa fa-circle-thin"),
	header("x-fa fa-header"),
	paragraph("x-fa fa-paragraph"),
	sliders("x-fa fa-sliders"),
	share_alt("x-fa fa-share-alt"),
	share_alt_square("x-fa fa-share-alt-square"),
	bomb("x-fa fa-bomb"),
	soccer_ball_o("x-fa fa-soccer-ball-o"),
	futbol_o("x-fa fa-futbol-o"),
	tty("x-fa fa-tty"),
	binoculars("x-fa fa-binoculars"),
	plug("x-fa fa-plug"),
	slideshare("x-fa fa-slideshare"),
	twitch("x-fa fa-twitch"),
	yelp("x-fa fa-yelp"),
	newspaper_o("x-fa fa-newspaper-o"),
	wifi("x-fa fa-wifi"),
	calculator("x-fa fa-calculator"),
	paypal("x-fa fa-paypal"),
	google_wallet("x-fa fa-google-wallet"),
	cc_visa("x-fa fa-cc-visa"),
	cc_mastercard("x-fa fa-cc-mastercard"),
	cc_discover("x-fa fa-cc-discover"),
	cc_amex("x-fa fa-cc-amex"),
	cc_paypal("x-fa fa-cc-paypal"),
	cc_stripe("x-fa fa-cc-stripe"),
	bell_slash("x-fa fa-bell-slash"),
	bell_slash_o("x-fa fa-bell-slash-o"),
	trash("x-fa fa-trash"),
	copyright("x-fa fa-copyright"),
	at("x-fa fa-at"),
	eyedropper("x-fa fa-eyedropper"),
	paint_brush("x-fa fa-paint-brush"),
	birthday_cake("x-fa fa-birthday-cake"),
	area_chart("x-fa fa-area-chart"),
	pie_chart("x-fa fa-pie-chart"),
	line_chart("x-fa fa-line-chart"),
	lastfm("x-fa fa-lastfm"),
	lastfm_square("x-fa fa-lastfm-square"),
	toggle_off("x-fa fa-toggle-off"),
	toggle_on("x-fa fa-toggle-on"),
	bicycle("x-fa fa-bicycle"),
	bus("x-fa fa-bus"),
	ioxhost("x-fa fa-ioxhost"),
	angellist("x-fa fa-angellist"),
	cc("x-fa fa-cc"),
	shekel("x-fa fa-shekel"),
	sheqel("x-fa fa-sheqel"),
	ils("x-fa fa-ils"),
	meanpath("x-fa fa-meanpath"),
	buysellads("x-fa fa-buysellads"),
	connectdevelop("x-fa fa-connectdevelop"),
	dashcube("x-fa fa-dashcube"),
	forumbee("x-fa fa-forumbee"),
	leanpub("x-fa fa-leanpub"),
	sellsy("x-fa fa-sellsy"),
	shirtsinbulk("x-fa fa-shirtsinbulk"),
	simplybuilt("x-fa fa-simplybuilt"),
	skyatlas("x-fa fa-skyatlas"),
	cart_plus("x-fa fa-cart-plus"),
	cart_arrow_down("x-fa fa-cart-arrow-down"),
	diamond("x-fa fa-diamond"),
	ship("x-fa fa-ship"),
	user_secret("x-fa fa-user-secret"),
	motorcycle("x-fa fa-motorcycle"),
	street_view("x-fa fa-street-view"),
	heartbeat("x-fa fa-heartbeat"),
	venus("x-fa fa-venus"),
	mars("x-fa fa-mars"),
	mercury("x-fa fa-mercury"),
	intersex("x-fa fa-intersex"),
	transgender("x-fa fa-transgender"),
	transgender_alt("x-fa fa-transgender-alt"),
	venus_double("x-fa fa-venus-double"),
	mars_double("x-fa fa-mars-double"),
	venus_mars("x-fa fa-venus-mars"),
	mars_stroke("x-fa fa-mars-stroke"),
	mars_stroke_v("x-fa fa-mars-stroke-v"),
	mars_stroke_h("x-fa fa-mars-stroke-h"),
	neuter("x-fa fa-neuter"),
	genderless("x-fa fa-genderless"),
	facebook_official("x-fa fa-facebook-official"),
	pinterest_p("x-fa fa-pinterest-p"),
	whatsapp("x-fa fa-whatsapp"),
	server("x-fa fa-server"),
	user_plus("x-fa fa-user-plus"),
	user_times("x-fa fa-user-times"),
	hotel("x-fa fa-hotel"),
	bed("x-fa fa-bed"),
	viacoin("x-fa fa-viacoin"),
	train("x-fa fa-train"),
	subway("x-fa fa-subway"),
	medium("x-fa fa-medium"),
	yc("x-fa fa-yc"),
	y_combinator("x-fa fa-y-combinator"),
	optin_monster("x-fa fa-optin-monster"),
	opencart("x-fa fa-opencart"),
	expeditedssl("x-fa fa-expeditedssl"),
	battery_full("x-fa fa-battery-full"),
	battery_three_quarters("x-fa fa-battery-three-quarters"),
	battery_half("x-fa fa-battery-half"),
	battery_quarter("x-fa fa-battery-quarter"),
	battery_empty("x-fa fa-battery-empty"),
	mouse_pointer("x-fa fa-mouse-pointer"),
	i_cursor("x-fa fa-i-cursor"),
	object_group("x-fa fa-object-group"),
	object_ungroup("x-fa fa-object-ungroup"),
	sticky_note("x-fa fa-sticky-note"),
	sticky_note_o("x-fa fa-sticky-note-o"),
	cc_jcb("x-fa fa-cc-jcb"),
	cc_diners_club("x-fa fa-cc-diners-club"),
	clone("x-fa fa-clone"),
	balance_scale("x-fa fa-balance-scale"),
	hourglass_o("x-fa fa-hourglass-o"),
	hourglass_start("x-fa fa-hourglass-start"),
	hourglass_half("x-fa fa-hourglass-half"),
	hourglass_end("x-fa fa-hourglass-end"),
	hourglass("x-fa fa-hourglass"),
	hand_grab_o("x-fa fa-hand-grab-o"),
	hand_rock_o("x-fa fa-hand-rock-o"),
	hand_stop_o("x-fa fa-hand-stop-o"),
	hand_paper_o("x-fa fa-hand-paper-o"),
	hand_scissors_o("x-fa fa-hand-scissors-o"),
	hand_lizard_o("x-fa fa-hand-lizard-o"),
	hand_spock_o("x-fa fa-hand-spock-o"),
	hand_pointer_o("x-fa fa-hand-pointer-o"),
	hand_peace_o("x-fa fa-hand-peace-o"),
	trademark("x-fa fa-trademark"),
	registered("x-fa fa-registered"),
	creative_commons("x-fa fa-creative-commons"),
	gg("x-fa fa-gg"),
	gg_circle("x-fa fa-gg-circle"),
	tripadvisor("x-fa fa-tripadvisor"),
	odnoklassniki("x-fa fa-odnoklassniki"),
	odnoklassniki_square("x-fa fa-odnoklassniki-square"),
	get_pocket("x-fa fa-get-pocket"),
	wikipedia_w("x-fa fa-wikipedia-w"),
	safari("x-fa fa-safari"),
	chrome("x-fa fa-chrome"),
	firefox("x-fa fa-firefox"),
	opera("x-fa fa-opera"),
	internet_explorer("x-fa fa-internet-explorer"),
	tv("x-fa fa-tv"),
	television("x-fa fa-television"),
	contao("x-fa fa-contao"),
	amazon("x-fa fa-amazon"),
	calendar_plus_o("x-fa fa-calendar-plus-o"),
	calendar_minus_o("x-fa fa-calendar-minus-o"),
	calendar_times_o("x-fa fa-calendar-times-o"),
	calendar_check_o("x-fa fa-calendar-check-o"),
	industry("x-fa fa-industry"),
	map_pin("x-fa fa-map-pin"),
	map_signs("x-fa fa-map-signs"),
	map_o("x-fa fa-map-o"),
	map("x-fa fa-map"),
	commenting("x-fa fa-commenting"),
	commenting_o("x-fa fa-commenting-o"),
	houzz("x-fa fa-houzz"),
	vimeo("x-fa fa-vimeo"),
	black_tie("x-fa fa-black-tie"),
	fonticons("x-fa fa-fonticons"),
	;
	
	@RxModelField(isDisplay=true)
	private String code;
	
	IconCls(String code){
	this.setCode(code);
	}
	public String getCode() {
	return code;
	}
	public void setCode(String code) {
	this.code = code;
	}
	
	public static void main(String[] args) {
		StringBuilder localStrBulider = new StringBuilder();
		String[] files = new String[]{
				"D:\\eclipse-workspace\\rx\\rx-extc\\src\\main\\webapp\\ext6\\build\\classic\\theme-triton\\resources\\theme-triton-all_2.css",
				"D:\\eclipse-workspace\\rx\\rx-extc\\src\\main\\webapp\\dashboard\\classic\\resources\\Admin-all_2.css"};
		
		for(String f:files) {
			File file = new File(f);
	        if(file.isFile() && file.exists()) {
	            try {
	                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
	                BufferedReader bufferReader = new BufferedReader(inputStreamReader);
	                String lineStr = null;
	                while((lineStr = bufferReader.readLine()) != null) {
	                    localStrBulider.append(lineStr);
	                }
	                bufferReader.close();
	                inputStreamReader.close();
	            } catch (Exception e) {
	            	e.printStackTrace();
	            }
	        }else {
	        	System.out.println("文件不存在");
	        }
		}
        String patt = "\\.fa[-a-z]*\\:before";
        Pattern r = Pattern.compile(patt);
        String line = localStrBulider.toString();
        Matcher m = r.matcher(line);
        int i = 0;
        String mt,mt2;
        Map<String, String> map = new HashMap<String,String>();
        while (m.find()) {
        	mt = m.group(0);
            if(!map.containsKey(mt)) {
            	map.put(mt, "");
            	i++;
            	
            	mt = mt.replaceAll(".fa-", "");
            	mt = mt.replaceAll(":before", "");
            	
            	
            	mt2 = mt.replaceAll("-", "_");
            	
            	System.out.println(mt2+"(\"x-fa fa-"+mt+"\"),");
            }
            //System.out.println("start:" + m.start() + " end:" + m.end());
        }
        System.out.println("count:"+i);
	}
}