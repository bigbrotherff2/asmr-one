package one.asmr.asmr

import io.flutter.embedding.android.FlutterActivity
import com.ryanheise.audioservice.AudioServiceActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import one.asmr.asmr.lyric.LyricOverlayPlugin

class MainActivity: AudioServiceActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        
        MethodChannel(
            flutterEngine.dartExecutor.binaryMessenger,
            "one.asmr.asmr/lyric_overlay"
        ).setMethodCallHandler(LyricOverlayPlugin(this))
    }
} 