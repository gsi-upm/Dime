package org.telcodev.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimeLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_OBRACKET=10;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_BOOL=18;
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_CONCATENATION=15;
    public static final int RULE_INT=6;
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
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_DOUBLE=19;
    public static final int RULE_NULL=16;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_LOGIC_WORD=9;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SESSION=17;
    public static final int RULE_EVENTENUM=8;
    public static final int RULE_WS=21;
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
    public String getGrammarFileName() { return "../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:11:7: ( 'application' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:11:9: 'application'
            {
            match("application"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:12:7: ( 'state' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:12:9: 'state'
            {
            match("state"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:13:7: ( 'times' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:13:9: 'times'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:14:7: ( 'timeout' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:14:9: 'timeout'
            {
            match("timeout"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:15:7: ( '{' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:15:9: '{'
            {
            match('{'); 

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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:16:7: ( '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:16:9: '}'
            {
            match('}'); 

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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:17:7: ( 'call' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:17:9: 'call'
            {
            match("call"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:18:7: ( ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:18:9: ';'
            {
            match(';'); 

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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:19:7: ( 'dialTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:19:9: 'dialTo'
            {
            match("dialTo"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:20:7: ( 'play' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:20:9: 'play'
            {
            match("play"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:21:7: ( 'record' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:21:9: 'record'
            {
            match("record"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:22:7: ( 'seconds' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:22:9: 'seconds'
            {
            match("seconds"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:23:7: ( 'in' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:23:9: 'in'
            {
            match("in"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:24:7: ( '->' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:24:9: '->'
            {
            match("->"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:25:7: ( 'reject;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:25:9: 'reject;'
            {
            match("reject;"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:26:7: ( 'hangUp;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:26:9: 'hangUp;'
            {
            match("hangUp;"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:27:7: ( 'get' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:27:9: 'get'
            {
            match("get"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:28:7: ( 'digits' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:28:9: 'digits'
            {
            match("digits"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:29:7: ( 'ask' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:29:9: 'ask'
            {
            match("ask"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:30:7: ( 'send' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:30:9: 'send'
            {
            match("send"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:31:7: ( 'to' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:31:9: 'to'
            {
            match("to"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:32:7: ( ',' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:32:9: ','
            {
            match(','); 

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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:33:7: ( '=>' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:33:9: '=>'
            {
            match("=>"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:34:7: ( 'say' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:34:9: 'say'
            {
            match("say"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:35:7: ( 'goTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:35:9: 'goTo'
            {
            match("goTo"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:36:7: ( 'when' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:36:9: 'when'
            {
            match("when"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:37:7: ( 'else' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:37:9: 'else'
            {
            match("else"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:38:7: ( 'if' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:38:9: 'if'
            {
            match("if"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:39:7: ( 'varString' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:39:9: 'varString'
            {
            match("varString"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:40:7: ( '=' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:40:9: '='
            {
            match('='); 

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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:41:7: ( 'varNum' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:41:9: 'varNum'
            {
            match("varNum"); 


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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:42:7: ( 'varBool' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:42:9: 'varBool'
            {
            match("varBool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_EVENTENUM"
    public final void mRULE_EVENTENUM() throws RecognitionException {
        try {
            int _type = RULE_EVENTENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:16: ( ( 'hangup' | 'completed' | 'error' | 'times' | 'timeout' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:18: ( 'hangup' | 'completed' | 'error' | 'times' | 'timeout' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:18: ( 'hangup' | 'completed' | 'error' | 'times' | 'timeout' )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:19: 'hangup'
                    {
                    match("hangup"); 


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:28: 'completed'
                    {
                    match("completed"); 


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:40: 'error'
                    {
                    match("error"); 


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:48: 'times'
                    {
                    match("times"); 


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:56: 'timeout'
                    {
                    match("timeout"); 


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
    // $ANTLR end "RULE_EVENTENUM"

    // $ANTLR start "RULE_SESSION"
    public final void mRULE_SESSION() throws RecognitionException {
        try {
            int _type = RULE_SESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:14: ( ( 'caller' | 'lastState' | 'time' | 'called' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:16: ( 'caller' | 'lastState' | 'time' | 'called' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:16: ( 'caller' | 'lastState' | 'time' | 'called' )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:17: 'caller'
                    {
                    match("caller"); 


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:26: 'lastState'
                    {
                    match("lastState"); 


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:38: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:45: 'called'
                    {
                    match("called"); 


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
    // $ANTLR end "RULE_SESSION"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2887:13: ( RULE_INT '.' RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2887:15: RULE_INT '.' RULE_INT
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2889:11: ( 'null' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2889:13: 'null'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:11: ( ( 'true' | 'false' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:13: ( 'true' | 'false' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:13: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:21: 'false'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2893:17: ( ( '&&' | '||' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2893:19: ( '&&' | '||' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2893:19: ( '&&' | '||' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='&') ) {
                alt4=1;
            }
            else if ( (LA4_0=='|') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2893:20: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2893:25: '||'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:14: ( ( '<' | '==' | '>' | '<=' | '>=' | '!=' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='=') ) {
                    alt5=4;
                }
                else {
                    alt5=1;}
                }
                break;
            case '=':
                {
                alt5=2;
                }
                break;
            case '>':
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3=='=') ) {
                    alt5=5;
                }
                else {
                    alt5=3;}
                }
                break;
            case '!':
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:17: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:21: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:26: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:35: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:40: '!='
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2897:11: ( ( '*' | '/' | '-' | '+' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2897:13: ( '*' | '/' | '-' | '+' )
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2899:20: ( '.' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2899:22: '.'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2901:15: ( '!' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2901:17: '!'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2903:15: ( '(' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2903:17: '('
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:15: ( ')' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:17: ')'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2907:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2907:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2907:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2907:11: '^'
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2907:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:
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
            	    break loop7;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:10: ( ( '0' .. '9' )+ )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:12: ( '0' .. '9' )+
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2913:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2913:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2913:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2913:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:41: ( '\\r' )? '\\n'
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2915:41: '\\r'
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2917:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2917:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2917:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2919:16: ( . )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2919:18: .
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
        // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_EVENTENUM | RULE_SESSION | RULE_DOUBLE | RULE_NULL | RULE_BOOL | RULE_LOGIC_WORD | RULE_COMPARE | RULE_MATH | RULE_CONCATENATION | RULE_NEGATION | RULE_OBRACKET | RULE_CBRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=51;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:202: RULE_EVENTENUM
                {
                mRULE_EVENTENUM(); 

                }
                break;
            case 34 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:217: RULE_SESSION
                {
                mRULE_SESSION(); 

                }
                break;
            case 35 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:230: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 36 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:242: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 37 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:252: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 38 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:262: RULE_LOGIC_WORD
                {
                mRULE_LOGIC_WORD(); 

                }
                break;
            case 39 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:278: RULE_COMPARE
                {
                mRULE_COMPARE(); 

                }
                break;
            case 40 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:291: RULE_MATH
                {
                mRULE_MATH(); 

                }
                break;
            case 41 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:301: RULE_CONCATENATION
                {
                mRULE_CONCATENATION(); 

                }
                break;
            case 42 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:320: RULE_NEGATION
                {
                mRULE_NEGATION(); 

                }
                break;
            case 43 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:334: RULE_OBRACKET
                {
                mRULE_OBRACKET(); 

                }
                break;
            case 44 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:348: RULE_CBRACKET
                {
                mRULE_CBRACKET(); 

                }
                break;
            case 45 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:362: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:370: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:379: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 48 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:391: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:407: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:423: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1:431: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\143\3\uffff\1\151\1\155\1\145\1\157\2\uffff";
    static final String DFA1_maxS =
        "\1\164\3\uffff\1\151\1\155\1\145\1\163\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\4\1\5";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\3\2\uffff\1\1\13\uffff\1\4",
            "",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\3\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "2883:18: ( 'hangup' | 'completed' | 'error' | 'times' | 'timeout' )";
        }
    }
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\143\1\141\2\uffff\2\154\1\145\1\144\2\uffff";
    static final String DFA2_maxS =
        "\1\164\1\141\2\uffff\2\154\1\145\1\162\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\3\4\uffff\1\1\1\4";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\10\uffff\1\2\7\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\15\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "2885:16: ( 'caller' | 'lastState' | 'time' | 'called' )";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\3\52\2\uffff\1\52\1\uffff\4\52\1\74\2\52\1\uffff\1\103"+
        "\4\52\1\111\2\52\2\47\2\uffff\1\117\1\74\3\uffff\1\47\1\uffff\2"+
        "\47\3\uffff\2\52\1\uffff\4\52\1\136\1\52\2\uffff\2\52\1\uffff\3"+
        "\52\1\147\1\150\2\uffff\3\52\4\uffff\5\52\2\uffff\1\111\2\52\11"+
        "\uffff\1\52\1\164\3\52\1\170\1\52\1\uffff\10\52\2\uffff\1\52\1\u0083"+
        "\11\52\1\uffff\2\52\1\u0091\1\uffff\1\u0094\1\u0095\1\u0097\3\52"+
        "\1\u009b\3\52\1\uffff\1\u00a0\1\u00a1\1\u00a2\5\52\1\u00a8\2\52"+
        "\1\u00ab\1\52\1\uffff\1\u00ad\1\52\2\uffff\1\52\1\uffff\3\52\1\uffff"+
        "\4\52\3\uffff\1\u00b8\4\52\1\uffff\1\u0095\1\52\1\uffff\1\52\1\uffff"+
        "\1\52\2\u0094\1\52\1\u00c1\1\u00c2\1\u00c3\2\52\1\u00b8\1\uffff"+
        "\1\52\1\u00c7\3\52\1\u00cb\1\u00cc\1\52\5\uffff\1\52\1\uffff\1\u00cf"+
        "\2\52\2\uffff\2\52\1\uffff\2\52\1\u00b8\1\u00d6\1\u0094\1\52\1\uffff"+
        "\1\u00d8\1\uffff";
    static final String DFA17_eofS =
        "\u00d9\uffff";
    static final String DFA17_minS =
        "\1\0\1\160\1\141\1\151\2\uffff\1\141\1\uffff\1\151\1\154\1\145\1"+
        "\146\1\76\1\141\1\145\1\uffff\1\75\1\150\1\154\2\141\1\56\1\165"+
        "\1\141\1\46\1\174\2\uffff\1\75\1\52\3\uffff\1\101\1\uffff\2\0\3"+
        "\uffff\1\160\1\153\1\uffff\1\141\1\143\1\171\1\155\1\60\1\165\2"+
        "\uffff\1\154\1\155\1\uffff\2\141\1\143\2\60\2\uffff\1\156\1\164"+
        "\1\124\4\uffff\1\145\1\163\2\162\1\163\2\uffff\1\56\2\154\11\uffff"+
        "\1\154\1\60\1\164\1\157\1\144\1\60\1\145\1\uffff\1\145\1\154\1\160"+
        "\1\154\1\151\1\171\1\157\1\145\2\uffff\1\147\1\60\1\157\1\156\1"+
        "\145\1\157\1\102\1\164\1\154\1\163\1\151\1\uffff\1\145\1\156\1\60"+
        "\1\uffff\3\60\1\154\1\124\1\164\1\60\1\162\1\143\1\125\1\uffff\3"+
        "\60\1\162\1\164\1\165\1\157\1\123\1\60\1\145\1\143\1\60\1\144\1"+
        "\uffff\1\60\1\165\2\uffff\1\144\1\uffff\1\145\1\157\1\163\1\uffff"+
        "\1\144\1\164\2\160\3\uffff\1\60\1\162\1\155\1\157\1\164\1\uffff"+
        "\1\60\1\141\1\uffff\1\163\1\uffff\1\164\2\60\1\164\3\60\2\73\1\60"+
        "\1\uffff\1\151\1\60\1\154\1\141\1\164\2\60\1\145\5\uffff\1\156\1"+
        "\uffff\1\60\1\164\1\151\2\uffff\1\144\1\147\1\uffff\1\145\1\157"+
        "\3\60\1\156\1\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\163\1\164\1\162\2\uffff\1\157\1\uffff\1\151\1\154\1\145"+
        "\1\156\1\76\1\141\1\157\1\uffff\1\76\1\150\1\162\2\141\1\71\1\165"+
        "\1\141\1\46\1\174\2\uffff\1\75\1\57\3\uffff\1\172\1\uffff\2\uffff"+
        "\3\uffff\1\160\1\153\1\uffff\1\141\1\156\1\171\1\155\1\172\1\165"+
        "\2\uffff\1\154\1\155\1\uffff\1\147\1\141\1\152\2\172\2\uffff\1\156"+
        "\1\164\1\124\4\uffff\1\145\1\163\2\162\1\163\2\uffff\1\71\2\154"+
        "\11\uffff\1\154\1\172\1\164\1\157\1\144\1\172\1\145\1\uffff\1\145"+
        "\1\154\1\160\1\154\1\151\1\171\1\157\1\145\2\uffff\1\147\1\172\1"+
        "\157\1\156\1\145\1\157\1\123\1\164\1\154\1\163\1\151\1\uffff\1\145"+
        "\1\156\1\172\1\uffff\3\172\1\154\1\124\1\164\1\172\1\162\1\143\1"+
        "\165\1\uffff\3\172\1\162\1\164\1\165\1\157\1\123\1\172\1\145\1\143"+
        "\1\172\1\144\1\uffff\1\172\1\165\2\uffff\1\162\1\uffff\1\145\1\157"+
        "\1\163\1\uffff\1\144\1\164\2\160\3\uffff\1\172\1\162\1\155\1\157"+
        "\1\164\1\uffff\1\172\1\141\1\uffff\1\163\1\uffff\1\164\2\172\1\164"+
        "\3\172\2\73\1\172\1\uffff\1\151\1\172\1\154\1\141\1\164\2\172\1"+
        "\145\5\uffff\1\156\1\uffff\1\172\1\164\1\151\2\uffff\1\144\1\147"+
        "\1\uffff\1\145\1\157\3\172\1\156\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\5\1\6\1\uffff\1\10\7\uffff\1\26\12\uffff\2\47\2\uffff"+
        "\1\51\1\53\1\54\1\uffff\1\55\2\uffff\1\50\1\62\1\63\2\uffff\1\55"+
        "\6\uffff\1\5\1\6\2\uffff\1\10\5\uffff\1\16\1\50\3\uffff\1\26\1\27"+
        "\1\47\1\36\5\uffff\1\56\1\43\3\uffff\1\46\1\52\1\60\1\61\1\51\1"+
        "\53\1\54\1\57\1\62\7\uffff\1\25\10\uffff\1\15\1\34\13\uffff\1\23"+
        "\3\uffff\1\30\12\uffff\1\21\15\uffff\1\24\2\uffff\1\42\1\45\1\uffff"+
        "\1\7\3\uffff\1\12\4\uffff\1\31\1\32\1\33\5\uffff\1\44\2\uffff\1"+
        "\2\1\uffff\1\3\12\uffff\1\41\10\uffff\1\11\1\22\1\13\1\17\1\20\1"+
        "\uffff\1\37\3\uffff\1\14\1\4\2\uffff\1\40\6\uffff\1\35\1\uffff\1"+
        "\1";
    static final String DFA17_specialS =
        "\1\0\42\uffff\1\2\1\1\u00b4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\34\1\43\3\47\1\30\1\44\1"+
            "\37\1\40\2\45\1\17\1\14\1\36\1\35\12\25\1\47\1\7\1\32\1\20\1"+
            "\33\2\47\32\42\3\47\1\41\1\42\1\47\1\1\1\42\1\6\1\10\1\22\1"+
            "\27\1\16\1\15\1\13\2\42\1\24\1\42\1\26\1\42\1\11\1\42\1\12\1"+
            "\2\1\3\1\42\1\23\1\21\3\42\1\4\1\31\1\5\uff82\47",
            "\1\50\2\uffff\1\51",
            "\1\55\3\uffff\1\54\16\uffff\1\53",
            "\1\56\5\uffff\1\57\2\uffff\1\60",
            "",
            "",
            "\1\63\15\uffff\1\64",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\7\uffff\1\71",
            "\1\73",
            "\1\75",
            "\1\76\11\uffff\1\77",
            "",
            "\1\102\1\101",
            "\1\104",
            "\1\105\5\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\112\1\uffff\12\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\116",
            "",
            "",
            "\1\102",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\125",
            "\0\125",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132\12\uffff\1\133",
            "\1\134",
            "\1\135",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\137",
            "",
            "",
            "\1\140",
            "\1\141",
            "",
            "\1\142\5\uffff\1\143",
            "\1\144",
            "\1\145\6\uffff\1\146",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\112\1\uffff\12\113",
            "\1\161",
            "\1\162",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u008a\13\uffff\1\u0089\4\uffff\1\u0088",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0093\3\52"+
            "\1\u0092\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0096\25\52",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\37\uffff\1\u009f",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "\1\u00aa",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ac",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ae",
            "",
            "",
            "\1\u00b0\15\uffff\1\u00af",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bd",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c4",
            "\1\u00c5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00c6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cd",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ce",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d7",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_EVENTENUM | RULE_SESSION | RULE_DOUBLE | RULE_NULL | RULE_BOOL | RULE_LOGIC_WORD | RULE_COMPARE | RULE_MATH | RULE_CONCATENATION | RULE_NEGATION | RULE_OBRACKET | RULE_CBRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='a') ) {s = 1;}

                        else if ( (LA17_0=='s') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0=='{') ) {s = 4;}

                        else if ( (LA17_0=='}') ) {s = 5;}

                        else if ( (LA17_0=='c') ) {s = 6;}

                        else if ( (LA17_0==';') ) {s = 7;}

                        else if ( (LA17_0=='d') ) {s = 8;}

                        else if ( (LA17_0=='p') ) {s = 9;}

                        else if ( (LA17_0=='r') ) {s = 10;}

                        else if ( (LA17_0=='i') ) {s = 11;}

                        else if ( (LA17_0=='-') ) {s = 12;}

                        else if ( (LA17_0=='h') ) {s = 13;}

                        else if ( (LA17_0=='g') ) {s = 14;}

                        else if ( (LA17_0==',') ) {s = 15;}

                        else if ( (LA17_0=='=') ) {s = 16;}

                        else if ( (LA17_0=='w') ) {s = 17;}

                        else if ( (LA17_0=='e') ) {s = 18;}

                        else if ( (LA17_0=='v') ) {s = 19;}

                        else if ( (LA17_0=='l') ) {s = 20;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 21;}

                        else if ( (LA17_0=='n') ) {s = 22;}

                        else if ( (LA17_0=='f') ) {s = 23;}

                        else if ( (LA17_0=='&') ) {s = 24;}

                        else if ( (LA17_0=='|') ) {s = 25;}

                        else if ( (LA17_0=='<') ) {s = 26;}

                        else if ( (LA17_0=='>') ) {s = 27;}

                        else if ( (LA17_0=='!') ) {s = 28;}

                        else if ( (LA17_0=='/') ) {s = 29;}

                        else if ( (LA17_0=='.') ) {s = 30;}

                        else if ( (LA17_0=='(') ) {s = 31;}

                        else if ( (LA17_0==')') ) {s = 32;}

                        else if ( (LA17_0=='^') ) {s = 33;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||(LA17_0>='j' && LA17_0<='k')||LA17_0=='m'||LA17_0=='o'||LA17_0=='q'||LA17_0=='u'||(LA17_0>='x' && LA17_0<='z')) ) {s = 34;}

                        else if ( (LA17_0=='\"') ) {s = 35;}

                        else if ( (LA17_0=='\'') ) {s = 36;}

                        else if ( ((LA17_0>='*' && LA17_0<='+')) ) {s = 37;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 38;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='#' && LA17_0<='%')||LA17_0==':'||(LA17_0>='?' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( ((LA17_36>='\u0000' && LA17_36<='\uFFFF')) ) {s = 85;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_35 = input.LA(1);

                        s = -1;
                        if ( ((LA17_35>='\u0000' && LA17_35<='\uFFFF')) ) {s = 85;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}