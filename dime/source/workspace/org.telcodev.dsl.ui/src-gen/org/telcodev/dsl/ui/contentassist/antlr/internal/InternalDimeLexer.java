package org.telcodev.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimeLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_OBRACKET=10;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int RULE_BOOL=17;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_CONCATENATION=15;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int RULE_COMPARE=12;
    public static final int RULE_CBRACKET=11;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NEGATION=13;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_DOUBLE=4;
    public static final int RULE_NULL=16;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_LOGIC_WORD=9;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=19;
    public static final int RULE_MATH=14;

    // delegates
    // delegators

    public InternalDimeLexer() {;} 
    public InternalDimeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDimeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:11:7: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:12:7: ( ' = ' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:12:9: ' = '
            {
            match(" = "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:13:7: ( 'Application' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:13:9: 'Application'
            {
            match("Application"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:14:7: ( 'State' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:14:9: 'State'
            {
            match("State"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:15:7: ( 'times' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:15:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:16:7: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:17:7: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:18:7: ( 'timeout' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:18:9: 'timeout'
            {
            match("timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:19:7: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:20:7: ( 'seconds' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:20:9: 'seconds'
            {
            match("seconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:21:7: ( 'digits' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:21:9: 'digits'
            {
            match("digits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:22:7: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:22:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:23:7: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:24:7: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:25:7: ( 'subject' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:25:9: 'subject'
            {
            match("subject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:26:7: ( 'from' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:26:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:27:7: ( 'message' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:27:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:28:7: ( 'when' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:28:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:29:7: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:29:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:30:7: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:30:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:31:7: ( 'String' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:31:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:32:7: ( 'Num' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:32:9: 'Num'
            {
            match("Num"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:33:7: ( 'Bool' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:33:9: 'Bool'
            {
            match("Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:34:7: ( 'Const' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:34:9: 'Const'
            {
            match("Const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:35:7: ( 'Call' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:35:9: 'Call'
            {
            match("Call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:36:7: ( 'DialTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:36:9: 'DialTo'
            {
            match("DialTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:37:7: ( 'Play' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:37:9: 'Play'
            {
            match("Play"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:38:7: ( 'Record' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:38:9: 'Record'
            {
            match("Record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:39:7: ( 'Reject;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:39:9: 'Reject;'
            {
            match("Reject;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:40:7: ( 'HangUp;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:40:9: 'HangUp;'
            {
            match("HangUp;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:41:7: ( 'Gather' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:41:9: 'Gather'
            {
            match("Gather"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:42:7: ( 'Send' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:42:9: 'Send'
            {
            match("Send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:43:7: ( 'Say' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:43:9: 'Say'
            {
            match("Say"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:44:7: ( 'Sms' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:44:9: 'Sms'
            {
            match("Sms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:45:7: ( 'Email' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:45:9: 'Email'
            {
            match("Email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:46:7: ( 'GoTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:46:9: 'GoTo'
            {
            match("GoTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:47:7: ( 'HANGUP' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:47:9: 'HANGUP'
            {
            match("HANGUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:48:7: ( 'COMPLETED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:48:9: 'COMPLETED'
            {
            match("COMPLETED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:49:7: ( 'ERROR' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:49:9: 'ERROR'
            {
            match("ERROR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:50:7: ( 'TIMES' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:50:9: 'TIMES'
            {
            match("TIMES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:51:7: ( 'CALLER' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:51:9: 'CALLER'
            {
            match("CALLER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:52:7: ( 'LASTSTATE' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:52:9: 'LASTSTATE'
            {
            match("LASTSTATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:53:7: ( 'CALLED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:53:9: 'CALLED'
            {
            match("CALLED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:54:7: ( 'DIGITS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:54:9: 'DIGITS'
            {
            match("DIGITS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:55:7: ( 'RECORD' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:55:9: 'RECORD'
            {
            match("RECORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:56:7: ( 'RINGING' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:56:9: 'RINGING'
            {
            match("RINGING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:57:7: ( 'IN-PROGRESS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:57:9: 'IN-PROGRESS'
            {
            match("IN-PROGRESS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:58:7: ( 'DISCONNECTED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:58:9: 'DISCONNECTED'
            {
            match("DISCONNECTED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:59:7: ( 'FAILED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:59:9: 'FAILED'
            {
            match("FAILED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8387:13: ( RULE_INT '.' RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8387:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8389:11: ( 'null' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8389:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8391:11: ( ( 'true' | 'false' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8391:13: ( 'true' | 'false' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8391:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8391:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8391:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_LOGIC_WORD"
    public final void mRULE_LOGIC_WORD() throws RecognitionException {
        try {
            int _type = RULE_LOGIC_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:17: ( ( '&&' | '||' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:19: ( '&&' | '||' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:19: ( '&&' | '||' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='&') ) {
                alt2=1;
            }
            else if ( (LA2_0=='|') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:20: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:25: '||'
                    {
                    match("||"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGIC_WORD"

    // $ANTLR start "RULE_COMPARE"
    public final void mRULE_COMPARE() throws RecognitionException {
        try {
            int _type = RULE_COMPARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:14: ( ( '<' | '==' | '>' | '<=' | '>=' | '!=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=1;}
                }
                break;
            case '=':
                {
                alt3=2;
                }
                break;
            case '>':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=5;
                }
                else {
                    alt3=3;}
                }
                break;
            case '!':
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:17: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:21: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:26: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:35: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:40: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPARE"

    // $ANTLR start "RULE_MATH"
    public final void mRULE_MATH() throws RecognitionException {
        try {
            int _type = RULE_MATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8397:11: ( ( '*' | '/' | '-' | '+' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8397:13: ( '*' | '/' | '-' | '+' )
            {
            if ( (input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MATH"

    // $ANTLR start "RULE_CONCATENATION"
    public final void mRULE_CONCATENATION() throws RecognitionException {
        try {
            int _type = RULE_CONCATENATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8399:20: ( '.' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8399:22: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONCATENATION"

    // $ANTLR start "RULE_NEGATION"
    public final void mRULE_NEGATION() throws RecognitionException {
        try {
            int _type = RULE_NEGATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8401:15: ( '!' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8401:17: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEGATION"

    // $ANTLR start "RULE_OBRACKET"
    public final void mRULE_OBRACKET() throws RecognitionException {
        try {
            int _type = RULE_OBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8403:15: ( '(' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8403:17: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBRACKET"

    // $ANTLR start "RULE_CBRACKET"
    public final void mRULE_CBRACKET() throws RecognitionException {
        try {
            int _type = RULE_CBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8405:15: ( ')' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8405:17: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CBRACKET"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8407:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8407:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8407:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8407:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8407:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8409:10: ( ( '0' .. '9' )+ )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8409:12: ( '0' .. '9' )+
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8409:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8409:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8413:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8413:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8413:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8413:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:41: ( '\\r' )? '\\n'
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8417:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8417:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8417:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8419:16: ( . )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8419:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_DOUBLE | RULE_NULL | RULE_BOOL | RULE_LOGIC_WORD | RULE_COMPARE | RULE_MATH | RULE_CONCATENATION | RULE_NEGATION | RULE_OBRACKET | RULE_CBRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=66;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:238: T__59
                {
                mT__59(); 

                }
                break;
            case 40 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:244: T__60
                {
                mT__60(); 

                }
                break;
            case 41 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:250: T__61
                {
                mT__61(); 

                }
                break;
            case 42 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:256: T__62
                {
                mT__62(); 

                }
                break;
            case 43 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:262: T__63
                {
                mT__63(); 

                }
                break;
            case 44 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:268: T__64
                {
                mT__64(); 

                }
                break;
            case 45 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:274: T__65
                {
                mT__65(); 

                }
                break;
            case 46 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:280: T__66
                {
                mT__66(); 

                }
                break;
            case 47 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:286: T__67
                {
                mT__67(); 

                }
                break;
            case 48 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:292: T__68
                {
                mT__68(); 

                }
                break;
            case 49 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:298: T__69
                {
                mT__69(); 

                }
                break;
            case 50 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:304: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 51 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:316: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 52 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:326: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 53 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:336: RULE_LOGIC_WORD
                {
                mRULE_LOGIC_WORD(); 

                }
                break;
            case 54 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:352: RULE_COMPARE
                {
                mRULE_COMPARE(); 

                }
                break;
            case 55 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:365: RULE_MATH
                {
                mRULE_MATH(); 

                }
                break;
            case 56 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:375: RULE_CONCATENATION
                {
                mRULE_CONCATENATION(); 

                }
                break;
            case 57 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:394: RULE_NEGATION
                {
                mRULE_NEGATION(); 

                }
                break;
            case 58 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:408: RULE_OBRACKET
                {
                mRULE_OBRACKET(); 

                }
                break;
            case 59 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:422: RULE_CBRACKET
                {
                mRULE_CBRACKET(); 

                }
                break;
            case 60 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:436: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:444: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:453: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 63 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:465: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:481: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:497: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1:505: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\62\1\64\3\66\3\uffff\2\66\2\uffff\22\66\1\142\1\66\2"+
        "\60\2\uffff\1\147\1\152\3\uffff\1\60\1\uffff\2\60\7\uffff\1\66\1"+
        "\uffff\5\66\1\166\1\66\3\uffff\3\66\2\uffff\5\66\1\u0080\26\66\1"+
        "\uffff\1\142\1\uffff\1\66\11\uffff\4\66\1\u009e\1\u009f\1\66\1\uffff"+
        "\11\66\1\uffff\1\u00aa\25\66\1\uffff\5\66\1\u00c5\2\uffff\1\66\1"+
        "\u00c8\3\66\1\u00cc\2\66\1\u00cf\1\u00d0\1\uffff\1\u00d1\1\66\1"+
        "\u00d3\5\66\1\u00d9\7\66\1\u00e1\5\66\1\u00e7\1\66\1\u00e9\1\66"+
        "\1\uffff\1\u00eb\1\66\1\uffff\3\66\1\uffff\1\u00c8\1\66\3\uffff"+
        "\1\u00f1\1\uffff\5\66\1\uffff\7\66\1\uffff\1\u00ff\1\u0100\1\u0101"+
        "\2\66\1\uffff\1\66\1\uffff\1\u0105\1\uffff\3\66\1\u0109\1\66\1\uffff"+
        "\1\66\1\u010c\1\u010d\1\u010e\1\u010f\1\66\1\u0111\1\66\1\u0113"+
        "\2\66\1\u0116\1\u0117\3\uffff\1\66\1\u0119\1\66\1\uffff\1\u011b"+
        "\1\u011c\1\u011d\1\uffff\1\u011e\1\66\4\uffff\1\66\3\uffff\1\u0121"+
        "\3\uffff\1\66\1\uffff\1\66\4\uffff\2\66\1\uffff\2\66\1\u0128\1\66"+
        "\1\u012a\1\66\1\uffff\1\66\1\uffff\1\u012d\1\66\1\uffff\1\u012f"+
        "\1\uffff";
    static final String DFA15_eofS =
        "\u0130\uffff";
    static final String DFA15_minS =
        "\1\0\2\75\1\160\1\141\1\151\3\uffff\1\145\1\151\2\uffff\1\141\1"+
        "\145\1\150\1\154\1\146\1\165\1\157\1\101\1\111\1\154\1\105\1\101"+
        "\1\141\1\122\1\111\1\101\1\116\1\101\1\56\1\165\1\46\1\174\2\uffff"+
        "\1\75\1\52\3\uffff\1\101\1\uffff\2\0\7\uffff\1\160\1\uffff\1\141"+
        "\1\156\1\171\1\163\1\155\1\60\1\165\3\uffff\1\143\1\142\1\147\2"+
        "\uffff\1\157\1\154\1\163\1\145\1\163\1\60\1\155\1\157\1\156\1\154"+
        "\1\115\1\114\1\141\1\107\1\141\1\143\1\103\1\116\1\156\1\116\1\164"+
        "\1\124\1\141\1\122\1\115\1\123\1\55\1\111\1\uffff\1\56\1\uffff\1"+
        "\154\11\uffff\1\154\1\164\1\151\1\144\2\60\1\145\1\uffff\1\145\1"+
        "\157\1\152\1\151\1\155\2\163\1\156\1\145\1\uffff\1\60\1\154\1\163"+
        "\1\154\1\120\1\114\1\154\1\111\1\103\1\171\1\157\1\145\1\117\1\107"+
        "\1\147\1\107\1\150\1\157\1\151\1\117\1\105\1\124\1\uffff\1\114\1"+
        "\154\1\151\1\145\1\156\1\60\2\uffff\1\157\1\60\1\156\1\145\1\164"+
        "\1\60\1\145\1\141\2\60\1\uffff\1\60\1\164\1\60\1\114\1\105\2\124"+
        "\1\117\1\60\1\162\1\143\1\122\1\111\2\125\1\145\1\60\1\154\1\122"+
        "\2\123\1\105\1\60\1\143\1\60\1\147\1\uffff\1\60\1\165\1\uffff\1"+
        "\144\1\143\1\163\1\uffff\1\60\1\147\3\uffff\1\60\1\uffff\1\105\1"+
        "\104\1\157\1\123\1\116\1\uffff\1\144\1\164\1\104\1\116\1\160\1\120"+
        "\1\162\1\uffff\3\60\1\124\1\104\1\uffff\1\141\1\uffff\1\60\1\uffff"+
        "\1\164\1\163\1\164\1\60\1\145\1\uffff\1\124\4\60\1\116\1\60\1\73"+
        "\1\60\1\107\1\73\2\60\3\uffff\1\101\1\60\1\164\1\uffff\3\60\1\uffff"+
        "\1\60\1\105\4\uffff\1\105\3\uffff\1\60\3\uffff\1\124\1\uffff\1\151"+
        "\4\uffff\1\104\1\103\1\uffff\1\105\1\157\1\60\1\124\1\60\1\156\1"+
        "\uffff\1\105\1\uffff\1\60\1\104\1\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\75\1\160\1\164\1\162\3\uffff\1\165\1\151\2\uffff\1\162"+
        "\1\145\1\150\1\154\1\146\1\165\2\157\1\151\1\154\1\145\1\141\1\157"+
        "\1\155\1\111\1\101\1\116\1\101\1\71\1\165\1\46\1\174\2\uffff\1\75"+
        "\1\57\3\uffff\1\172\1\uffff\2\uffff\7\uffff\1\160\1\uffff\1\162"+
        "\1\156\1\171\1\163\1\155\1\172\1\165\3\uffff\1\143\1\142\1\147\2"+
        "\uffff\1\157\1\154\1\163\1\145\1\163\1\172\1\155\1\157\1\156\1\154"+
        "\1\115\1\114\1\141\1\123\1\141\1\152\1\103\1\116\1\156\1\116\1\164"+
        "\1\124\1\141\1\122\1\115\1\123\1\55\1\111\1\uffff\1\71\1\uffff\1"+
        "\154\11\uffff\1\154\1\164\1\151\1\144\2\172\1\145\1\uffff\1\145"+
        "\1\157\1\152\1\151\1\155\2\163\1\156\1\145\1\uffff\1\172\1\154\1"+
        "\163\1\154\1\120\1\114\1\154\1\111\1\103\1\171\1\157\1\145\1\117"+
        "\1\107\1\147\1\107\1\150\1\157\1\151\1\117\1\105\1\124\1\uffff\1"+
        "\114\1\154\1\151\1\145\1\156\1\172\2\uffff\1\163\1\172\1\156\1\145"+
        "\1\164\1\172\1\145\1\141\2\172\1\uffff\1\172\1\164\1\172\1\114\1"+
        "\105\2\124\1\117\1\172\1\162\1\143\1\122\1\111\2\125\1\145\1\172"+
        "\1\154\1\122\2\123\1\105\1\172\1\143\1\172\1\147\1\uffff\1\172\1"+
        "\165\1\uffff\1\144\1\143\1\163\1\uffff\1\172\1\147\3\uffff\1\172"+
        "\1\uffff\1\105\1\122\1\157\1\123\1\116\1\uffff\1\144\1\164\1\104"+
        "\1\116\1\160\1\120\1\162\1\uffff\3\172\1\124\1\104\1\uffff\1\141"+
        "\1\uffff\1\172\1\uffff\1\164\1\163\1\164\1\172\1\145\1\uffff\1\124"+
        "\4\172\1\116\1\172\1\73\1\172\1\107\1\73\2\172\3\uffff\1\101\1\172"+
        "\1\164\1\uffff\3\172\1\uffff\1\172\1\105\4\uffff\1\105\3\uffff\1"+
        "\172\3\uffff\1\124\1\uffff\1\151\4\uffff\1\104\1\103\1\uffff\1\105"+
        "\1\157\1\172\1\124\1\172\1\156\1\uffff\1\105\1\uffff\1\172\1\104"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\6\1\7\1\11\2\uffff\1\15\1\16\26\uffff\2\66\2\uffff\1"+
        "\70\1\72\1\73\1\uffff\1\74\2\uffff\1\67\1\101\1\102\1\66\1\1\1\2"+
        "\1\101\1\uffff\1\74\7\uffff\1\6\1\7\1\11\3\uffff\1\15\1\16\34\uffff"+
        "\1\75\1\uffff\1\62\1\uffff\1\65\1\71\1\77\1\100\1\67\1\70\1\72\1"+
        "\73\1\76\7\uffff\1\14\11\uffff\1\24\26\uffff\1\57\6\uffff\1\41\1"+
        "\42\12\uffff\1\26\32\uffff\1\40\2\uffff\1\64\3\uffff\1\20\2\uffff"+
        "\1\22\1\23\1\27\1\uffff\1\31\5\uffff\1\33\7\uffff\1\44\5\uffff\1"+
        "\63\1\uffff\1\4\1\uffff\1\5\5\uffff\1\30\15\uffff\1\43\1\47\1\50"+
        "\3\uffff\1\25\3\uffff\1\13\2\uffff\1\51\1\53\1\32\1\54\1\uffff\1"+
        "\34\1\35\1\55\1\uffff\1\36\1\45\1\37\1\uffff\1\61\1\uffff\1\10\1"+
        "\12\1\17\1\21\2\uffff\1\56\6\uffff\1\46\1\uffff\1\52\2\uffff\1\3"+
        "\1\uffff\1\60";
    static final String DFA15_specialS =
        "\1\0\53\uffff\1\1\1\2\u0102\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\2\1\45\1\54\3\60\1\41\1\55\1\50"+
            "\1\51\2\56\1\13\1\56\1\47\1\46\12\37\1\14\1\10\1\43\1\1\1\44"+
            "\2\60\1\3\1\23\1\24\1\25\1\32\1\36\1\31\1\30\1\35\2\53\1\34"+
            "\1\53\1\22\1\53\1\26\1\53\1\27\1\4\1\33\6\53\3\60\1\52\1\53"+
            "\1\60\3\53\1\12\1\20\1\15\2\53\1\21\3\53\1\16\1\40\4\53\1\11"+
            "\1\5\2\53\1\17\3\53\1\6\1\42\1\7\uff82\60",
            "\1\61",
            "\1\63",
            "\1\65",
            "\1\71\3\uffff\1\70\7\uffff\1\72\6\uffff\1\67",
            "\1\73\5\uffff\1\74\2\uffff\1\75",
            "",
            "",
            "",
            "\1\101\17\uffff\1\102",
            "\1\103",
            "",
            "",
            "\1\107\20\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\121\15\uffff\1\120\21\uffff\1\117\15\uffff\1\116",
            "\1\123\37\uffff\1\122",
            "\1\124",
            "\1\126\3\uffff\1\127\33\uffff\1\125",
            "\1\131\37\uffff\1\130",
            "\1\132\15\uffff\1\133",
            "\1\135\32\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\144\1\uffff\12\143",
            "\1\145",
            "\1\146",
            "\1\146",
            "",
            "",
            "\1\61",
            "\1\150\4\uffff\1\151",
            "",
            "",
            "",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\0\156",
            "\0\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "",
            "\1\160\20\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\167",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\13\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b\6\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\144\1\uffff\12\143",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u00c7\3\uffff\1\u00c6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00cd",
            "\1\u00ce",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00e8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ea",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f0",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u00f2",
            "\1\u00f4\15\uffff\1\u00f3",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u010a",
            "",
            "\1\u010b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0110",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0112",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0114",
            "\1\u0115",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u0118",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u011a",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u011f",
            "",
            "",
            "",
            "",
            "\1\u0120",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u0122",
            "",
            "\1\u0123",
            "",
            "",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0129",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012b",
            "",
            "\1\u012c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012e",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_DOUBLE | RULE_NULL | RULE_BOOL | RULE_LOGIC_WORD | RULE_COMPARE | RULE_MATH | RULE_CONCATENATION | RULE_NEGATION | RULE_OBRACKET | RULE_CBRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='=') ) {s = 1;}

                        else if ( (LA15_0==' ') ) {s = 2;}

                        else if ( (LA15_0=='A') ) {s = 3;}

                        else if ( (LA15_0=='S') ) {s = 4;}

                        else if ( (LA15_0=='t') ) {s = 5;}

                        else if ( (LA15_0=='{') ) {s = 6;}

                        else if ( (LA15_0=='}') ) {s = 7;}

                        else if ( (LA15_0==';') ) {s = 8;}

                        else if ( (LA15_0=='s') ) {s = 9;}

                        else if ( (LA15_0=='d') ) {s = 10;}

                        else if ( (LA15_0==',') ) {s = 11;}

                        else if ( (LA15_0==':') ) {s = 12;}

                        else if ( (LA15_0=='f') ) {s = 13;}

                        else if ( (LA15_0=='m') ) {s = 14;}

                        else if ( (LA15_0=='w') ) {s = 15;}

                        else if ( (LA15_0=='e') ) {s = 16;}

                        else if ( (LA15_0=='i') ) {s = 17;}

                        else if ( (LA15_0=='N') ) {s = 18;}

                        else if ( (LA15_0=='B') ) {s = 19;}

                        else if ( (LA15_0=='C') ) {s = 20;}

                        else if ( (LA15_0=='D') ) {s = 21;}

                        else if ( (LA15_0=='P') ) {s = 22;}

                        else if ( (LA15_0=='R') ) {s = 23;}

                        else if ( (LA15_0=='H') ) {s = 24;}

                        else if ( (LA15_0=='G') ) {s = 25;}

                        else if ( (LA15_0=='E') ) {s = 26;}

                        else if ( (LA15_0=='T') ) {s = 27;}

                        else if ( (LA15_0=='L') ) {s = 28;}

                        else if ( (LA15_0=='I') ) {s = 29;}

                        else if ( (LA15_0=='F') ) {s = 30;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 31;}

                        else if ( (LA15_0=='n') ) {s = 32;}

                        else if ( (LA15_0=='&') ) {s = 33;}

                        else if ( (LA15_0=='|') ) {s = 34;}

                        else if ( (LA15_0=='<') ) {s = 35;}

                        else if ( (LA15_0=='>') ) {s = 36;}

                        else if ( (LA15_0=='!') ) {s = 37;}

                        else if ( (LA15_0=='/') ) {s = 38;}

                        else if ( (LA15_0=='.') ) {s = 39;}

                        else if ( (LA15_0=='(') ) {s = 40;}

                        else if ( (LA15_0==')') ) {s = 41;}

                        else if ( (LA15_0=='^') ) {s = 42;}

                        else if ( ((LA15_0>='J' && LA15_0<='K')||LA15_0=='M'||LA15_0=='O'||LA15_0=='Q'||(LA15_0>='U' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='l')||(LA15_0>='o' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 43;}

                        else if ( (LA15_0=='\"') ) {s = 44;}

                        else if ( (LA15_0=='\'') ) {s = 45;}

                        else if ( ((LA15_0>='*' && LA15_0<='+')||LA15_0=='-') ) {s = 46;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r') ) {s = 47;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='%')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_44 = input.LA(1);

                        s = -1;
                        if ( ((LA15_44>='\u0000' && LA15_44<='\uFFFF')) ) {s = 110;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_45 = input.LA(1);

                        s = -1;
                        if ( ((LA15_45>='\u0000' && LA15_45<='\uFFFF')) ) {s = 110;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}