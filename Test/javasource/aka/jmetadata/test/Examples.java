package aka.jmetadata.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataVideo;
import aka.jmetadata.main.exception.LibNotfoundException;
import aka.jmetadata.main.mediainfo.MediaInfo;

public class Examples {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getLogger(MediaInfo.class.getPackage().getName());
    }

    /**
     * Main.
     *
     * @param args
     *            not used.
     */
    public static void main(final String[] args) {
//        testWithInternalDLL();
        testWithInternalDLL2();
        // testWithExternalDLL();
    }

    private static void testWithInternalDLL() {
        try {
            // use internal dll
            final JMetaData jMetadata = new JMetaData();

            final File directory = new File("d:/testvideos/");
            // final File directory = new
            // File("e:/downloads/Masters.of.Sex.S02E01.720p.HDTV.x264-IMMERSE/");
            final File[] children = getFiles(directory);
            if (children == null) {
                System.out.println("[test] testWithInternalDLL - no movie found in " + directory.getAbsolutePath());
            } else {
                for (final File file : children) {
                    System.out.println("[test] testWithInternalDLL - " + file.getAbsolutePath());
                    if (jMetadata.open(file)) {
                        printJMetadata(jMetadata);
                    }
                }
            }
            jMetadata.close();
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        } catch (final LibNotfoundException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    private static void testWithInternalDLL2() {
        try {
            // use internal dll
            final JMetaData jMetadata = new JMetaData();

            final File file = new File("\\\\Leviathan\\Movies\\HD\\Batman v Superman L’Aube de la Justice (2016).mkv");
//            final File file = new File("\\\\Leviathan\\Movies\\HD\\Prometheus (2012).mkv");
            System.out.println("[test] testWithInternalDLL - " + file.getAbsolutePath());
            if (jMetadata.open(file)) {
                printJMetadata(jMetadata);
            }
            jMetadata.close();
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        } catch (final LibNotfoundException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    private static void testWithExternalDLL() {
        // use external dll
        final JMetaData jMetadata = new JMetaData("./lib/");
        final File directory = new File("./Test/videos/");
        final File[] children = getFiles(directory);
        if (children == null) {
            System.out.println("[test] testWithExternalDLL - no movie found in " + directory.getAbsolutePath());
        } else {
            for (final File file : children) {
                System.out.println("[test] testWithExternalDLL - " + file.getAbsolutePath());
                if (jMetadata.open(file)) {
                    printJMetadata(jMetadata);
                }
            }
        }
        try {
            jMetadata.close();
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    private static void printJMetadata(@NonNull final JMetaData jMetadata) {
        final List<JMetaDataVideo> videoStreamList = jMetadata.getVideoStreams();

//        System.out.println("VIDEOS");
//        System.out.println("--------------------");
//        for (final JMetaDataVideo jMetadataVideo : videoStreamList) {
//            assert jMetadataVideo != null;
//            JMetaDataVideoTest.printJMetadataVideo(jMetadataVideo);
//        }
//        System.out.println("_________________________________________________________________________________________");
//
//        System.out.println("AUDIOS");
//        System.out.println("--------------------");
//        final List<JMetaDataAudio> audioStreamList = jMetadata.getAudioStreams();
//        for (final JMetaDataAudio jMetadataAudio : audioStreamList) {
//            assert jMetadataAudio != null;
//            JMetaDataAudioTest.printJMetadataAudio(jMetadataAudio);
//        }
//        System.out.println("_________________________________________________________________________________________");
//
//        System.out.println("TEXTS");
//        System.out.println("--------------------");
//        final List<JMetaDataText> textStreamList = jMetadata.getSubtitleStreams();
//        for (final JMetaDataText jMetadataSubtitle : textStreamList) {
//            assert jMetadataSubtitle != null;
//            JMetaDataTextTest.printJMetadataText(jMetadataSubtitle);
//        }
//        System.out.println("_________________________________________________________________________________________");
//
//        System.out.println("MENUS");
//        System.out.println("--------------------");
//
//        final List<JMetaDataMenu> menuStreamList = jMetadata.getMenuStreams();
//        for (final JMetaDataMenu jMetadataMenu : menuStreamList) {
//            assert jMetadataMenu != null;
//            JMetaDataMenuTest.printJMetadataMenu(jMetadataMenu);
//        }
//        System.out.println("_________________________________________________________________________________________");
    }

    private static File[] getFiles(@NonNull final File directory) {
        // It is also possible to filter the list of returned files.
        // This example does not return any files that start with `.'.
        final FilenameFilter filter = (final File dir, final String name) -> !name.startsWith(".");
        final File[] children = directory.listFiles(filter);

        return children;
    }
}
