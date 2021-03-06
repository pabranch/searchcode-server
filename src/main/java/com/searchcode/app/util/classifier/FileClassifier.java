/*
 * Copyright (c) 2016 Boyter Online Services
 *
 * Use of this software is governed by the Fair Source License included
 * in the LICENSE.TXT file, but will be eventually open under GNU General Public License Version 3
 * see the README.md for when this clause will take effect
 *
 * Version 1.3.8
 */

package com.searchcode.app.util.classifier;

import java.util.ArrayList;
import java.util.List;

public class FileClassifier {

    /**
     * A list containing all the known file types, their extensions and a selection of commonly used keywords inside
     * that file type. Used to identify files.
     */
    private List<Classifier> classifier = new ArrayList<>();
    {
        classifier.add(new Classifier("Text", "text,txt", ""));
        classifier.add(new Classifier("XAML", "xaml", "setter,value,style,margin,sstring,textblock,height,offset,gradientstop,stackpanel,width,propertymargin,trigger,lineargradientbrush,storyboard,image,duration,rectangle,settervalue,doubleanimation"));
        classifier.add(new Classifier("ASP.Net", "ascx,config,asmx,asax,master,aspx,sitemap", "version,cultureneutral,runatserver,systemwebextensions,publickeytokenbfade,section,customerrors,error,value,systemweb,configuration,include,attribute,position,setting,connectionstrings,absolute,dependentassembly,stylezindex,below"));
        classifier.add(new Classifier("HTML", "htm,html", "classpspanspan,classpspan,spanspan,classw,bgcoloreeeeff,classwspanspan,classospanspan,classnavbarcell,bgcolorwhite,classmispanspan,classospan,classcsingleline,valigntop,border,cellpadding,cellspacing,classs,classnf,titleclass,classcm"));
        classifier.add(new Classifier("MSBuild scripts", "csproj", "compile,reference,itemgroup,propertygroup,content,condition,target,copytooutputdirectoryalwayscopytooutputdirectory,errorreportprompterrorreport,warninglevelwarninglevel,configuration,platform,configurationplatform,embeddedresource,version,resource,projectreference,subtypedesignersubtype,import,debugsymbolstruedebugsymbols"));
        classifier.add(new Classifier("C#", "cs", "summary,param,public,static,string,return,value,summarypublic,class,object,double,private,values,method,using,license,which,version,false,override"));
        classifier.add(new Classifier("XSD", "XSD,xsd", "xsattribute,xselement,xsannotation,minoccurs,xscomplextype,typexsstring,xsenumeration,xssequence,useoptional,maxoccurs,xsdocumentation,maxoccursunbounded,xsdelement,xsrestriction,xssimpletype,element,xscomplexcontent,userequired,xsextension,nillabletrue"));
        classifier.add(new Classifier("XML", "xml,XML", "member,summary,param,value,rects,datetimetvalue,returns,property,datetimetvaluevalue,instance,remarks,feature,target,method,tiltedtiltedfeature,class,leftvalleftval,object,rightvalrightval,specified"));
        classifier.add(new Classifier("CMake", "txt,cmake", "license,endif,destination,build,under,cache,properties,without,software,distributed,library,install,cmake,version,copyright,systems,files,cmakedefine,internal,shared"));
        classifier.add(new Classifier("C/C++ Header", "h,hpp", "return,nsscriptable,nsimethod,define,license,const,version,under,public,class,struct,nsastring,interface,retval,nserrornullpointer,function,attribute,value,terms,ifndef"));
        classifier.add(new Classifier("C++", "cpp,cc,C", "return,const,object,license,break,result,false,software,value,public,stdstring,copyright,version,without,buffer,sizet,general,unsigned,string,jsfalse"));
        classifier.add(new Classifier("make", "MAKEFILE,makefile,rules,Makefile,GNUmakefile,am,test", "build,target,files,software,cflags,shell,makefile,cygdrivecusersmeirwazewpcibylbuild,clean,special,license,allsphinxopts,without,install,includes,finished,include,copyright,version,cppflags"));
        classifier.add(new Classifier("CSS", "css", "color,solid,backgroundposition,padding,width,margin,background,fontsize,border,backgroundcolor,display,fontweight,height,norepeat,position,backgroundimage,right,float,textalign,important"));
        classifier.add(new Classifier("Python", "py", "return,import,class,value,false,response,article,field,model,software,default,should,print,input,except,modelscharfieldmaxlength,fclean,object,valid,typetext"));
        classifier.add(new Classifier("MATLAB", "m", "narglistjj,arglistii,input,function,minvaljj,output,nextinput,nextoutput,matrix,number,vector,elseif,maxvaljj,errorargument,options,nargin,nargout,image,required,randib"));
        classifier.add(new Classifier("Objective C", "m", "return,nsstring,license,alloc,under,value,error,super,autorelease,should,release,count,class,string,length,nsarray,failed,copyright,nsuinteger,distributed"));
        classifier.add(new Classifier("Javascript", "js", "return,function,false,value,element,object,license,string,param,ecart,event,title,undefined,public,typeof,options,array,width,classkspan,handler"));
        classifier.add(new Classifier("Java", "java", "public,return,private,string,static,param,final,throws,license,catch,javaxswinggrouplayoutpreferredsize,class,override,software,value,exception,boolean,object,general,version"));
        classifier.add(new Classifier("PHP", "php4,php5,php,inc", "return,public,function,ecart,array,license,param,string,general,false,version,copyright,software,package,class,access,without,warranty,category,value"));
        classifier.add(new Classifier("Erlang", "erl,hrl", "state,error,license,false,module,value,stack,reason,binary,attrs,software,string,server,result,undefined,reply,public,version,under,lserver"));
        classifier.add(new Classifier("Fortran 77", "F,f77,f", "continue,integer,subroutine,endif,return,write,include,precision,double,elseif,implicit,character,function,dimension,format,print,array,parameter,check,energy"));
        classifier.add(new Classifier("Fortran 90", "f90,F90", "endif,integercmissintg,parameter,integerintg,error,equations,subroutine,pointer,variables,return,intentout,field,enddo,number,integer,intentin,license,select,problem,module"));
        classifier.add(new Classifier("C", "c", "return,static,const,symbol,error,break,value,struct,unsigned,while,pyobject,result,table,count,define,fterror,function,double,memory,ftuint"));
        classifier.add(new Classifier("Lisp", "lisp,el,lsp,sc,scm", "lambda,foreground,define,string,background,dylancall,result,function,value,software,state,buffer,class,clambda,start,equal,return,symbol,point,object"));
        classifier.add(new Classifier("Visual Basic", "vbs,vb,cls", "private,property,public,summary,return,class,value,assembly,nothing,byval,function,integer,friend,string,false,object,shared,module,readonly,sender"));
        classifier.add(new Classifier("Bourne Shell", "mips-cibyl-elf-g++,help,guppi_control,preupgrade,depcomp,freebsd-tick-processor,ld,run2,console,rdmgenshpmaps,mkstamp,SpeedLimiter,cache,p2-pub-fnp,VolumeCheck,most_recent_release,init,ls,jmeter-report,local,reassemble,callprocs,freetype-config,qtile,mkheaders,hcpp,reinstall,todone-resort,update_master,reconf,cibyl-jasmin,drop,rungodoc,check_conntrack,api_test,reil,buildCopyScript,rdmcompare,jmeter,crawler,elisp-comp,lebuild,weight,rdmgendcwmaps,add_out,runtest,mips-cibyl-elf-gcc,Build,imgur_upload,redis_init_script,dcraw-transcode,adacompiler,sub,postupgrade,hcc,template,prof,cygwin-wrapper,mingw32-setup-env,make-help-links,run,missing,openra-bin,make-dist,distr,sbf,lex,engine_install,preflight,sbundle,create-hadoop-image-remote,mysql-diff,convert,g,recover_db,shlib-install,cleanup_headers,ildasm,iconf_iff,iconf_flib,minidump_stackwalk_test,mac-tick-processor,iconf_term,linux-tick-processor,mylatexdiff,set-version,mips-cibyl-elf-ld,rdmgenmaps,gfgen,cemossheinfo,minidump_stackwalk_machine_readable_test,dumphtml,guess,prepare,make-html,add,shobj-conf,rdmdownload,ilasm,make-docs,webfinger,maybe-conf,minidump_dump_test,newsvg,configure,expsrc,c,preinstall,postrm,ncc-mono,test-mergesets-hgsub,jmeter-server,ylwrap,InstallationCheck,compile,attachlicense,PGPLOT_install,install,apiary,mkinstalldirs,compare,bootstrap,DIST,runprof,rpath,head,perlversion,choose-git-push,adasockets-config,check,mips-cibyl-elf-gccbug,pre,verify,mdate-sh,csc,postinstall,iconf_pgplot,build,test,antRun,mush_cap,status,iinames,stat,idlhelp,checkregress,gacutil,update,mkdirs,libtool,cygwin,rdmgetall,light,ghc-ver,alac2flac,sh,command,buildStripHeaders,mac-nm,install-sh,hello,postinst,uninstall", "devnull,asmelineno,version,asecho,confdefsh,program,acstatus,checking,conftestacext,error,conftesterr,directory,software,license,libtool,result,library,whether,files,return"));
        classifier.add(new Classifier("Ruby", "about,spawner,console,print_diagnostics,Rakefile,runner,plugin,request,dbconsole,server,jekyll,reaper,html5,rb,destroy,inspector,profiler,redcar,generate,benchmarker,ferret-browser", "should,class,endend,tnext,return,value,module,false,assertequal,unless,require,index,title,include,describe,string,input,options,redcar,block"));
        classifier.add(new Classifier("vim script", "vim", "keyword,match,hilink,contained,region,version,syntax,endif,start,containedsyn,display,tmenu,letter,return,skipwhite,command,highlighting,baanbshell,nargs,menutrans"));
        classifier.add(new Classifier("Assembly", "s,S,asm", "software,copyright,following,including,provided,conditions,without,implied,source,return,above,notice,limited,warranties,liability,binary,disclaimer,stack,redistributions,address"));
        classifier.add(new Classifier("Objective C++", "mm", "return,const,nsstring,software,copyright,license,alloc,window,event,release,false,class,including,result,apple,following,frame,without,above,break"));
        classifier.add(new Classifier("DTD", "dtd", "element,implied,cdata,attlist,entity,impliedattlist,contains,pcdata,required,description,version,false,attribute,pcdatathe,resource,optional,profile,value,attrs,deprecated"));
        classifier.add(new Classifier("SQL", "sql", "table,default,unsigned,values,where,insert,column,alter,varchar,primary,bestopwords,stopwordvalues,exists,entry,delete,change,spellprocevent,index,constraint,integer"));
        classifier.add(new Classifier("YAML", "yaml,yml", "image,length,category,namespace,platforms,linux,winreturns,river,tiles,beach,falsetiles,water,facings,rocktemplateid,rough,methoddescription,clear,string,cliff,basesize"));
        classifier.add(new Classifier("Ruby HTML", "rhtml", "classtd,linkto,action,class,table,width,input,classtdheaderbak,solid,title,value,function,partial,render,border,singularname,controller,cellpadding,divdiv,cellspacing"));
        classifier.add(new Classifier("Haskell", "hs,lhs", "return,where,string,nothing,qualified,module,maybe,binary,import,false,parser,result,parse,putstrln,error,version,right,function,copyright,otherwise"));
        classifier.add(new Classifier("Bourne Again Shell", "funcs,dist,ec2mim,search and replace,Micropolis,slacktest,ec2-delete-spot-datafeed-subscription,prerm,scp,engine_install,runsrc,sg_ctrl,ec2-describe-bundle-tasks,init,doc4allmods,qipmsg-xdg-open,ec2addpgrp,yabibe,run_keydiff,inputmenu-stdout,update_autogen,testrun,monitor-mangosd,pbs,rpm-build,git-svn-clone-externals,start_thor,ec2addvgw,sshslaves,ec2-stop-instances,ec2-describe-images,drupal-db-create,guppi_reset_shmem,ec2-authorize,ec2dsds,selfupdate,vegas_setup_shmem_mode01_sim,gen_lang,zmbkpose,ec2-describe-snapshots,compile,sub,experiment,ec2-allocate-address,ec2addsubnet,ec2dsnapatt,install-dotfiles,install,stripcr,simplesql,MFPconfigure,packing,ec2-revoke,ec2-release-address,ec2-deactivate-license,ec2-describe-subnets,ec2-delete-keypair,get-deps,ec2-describe-vpn-gateways,edit-dictionary,convert,ec2addsds,ec2-get-password,make-l10n,ec2delvgw,htmlgen,wusb-cbaf,ec2reboot,jython-run-tests,flac2alac,ec2dsir,keystone_install,vim,many-clients,celerybeat,ec2-run-user-data,ec2-fingerprint-key,ec2addsnap,gendoc,ec2-unmonitor-instances,init_roxie_cluster,debian-build,zmgwsi,ec2kill,launch-hadoop-cluster,ec2-describe-regions,ec2-bundle-instance,run_on,ec2dereg,new-branch,rhel,ec2-disassociate-address,init_sasha,utils,locker_scalac,rtorrent,deploy-local-maven-snapshot,benchmark,oregon,ec2-attach-vpn-gateway,pdfgen,guppi_adc_hist,resize,apacheconfig,setup,fisheye_deploy,profile_scalac,ec2gpass,ec2-describe-spot-datafeed-subscription,ec2dsubnet,erl,ec2stop,ec2-create-vpn-connection,runtest3,ec2miatt,ec2assocaddr,ec2delsubnet,share,gfp-translate,sample,copytodisk,ec2drio,rvmrc,setup_one_nfs,vegas_setup_shmem_mode06,vegas_setup_shmem_mode01,s3,vagrant,rsubl,lddsafe,launch-hadoop-slaves,ec2actlic,ec2-start-instances,config,ec2-describe-vpn-connections,ec2mimatt,ec2rinatt,stop,ec2-add-keypair,testall,dbreset,CreateMesh,summarize,bpsv,ec2dre,ec2-describe-volumes,ec2dri,ec2dvgw,manual_environment,ec2-delete-vpn-connection,grails-debug,runctags,ec2gcons,digest,gendocs,ttysetup,name_to_ip,guppi_monitor,ec2rsnapatt,vegas_setup_shmem_mode06_sim,scpslaves,ec2-describe-vpcs,ec2dlic,play_wine,postinstall,ec2-describe-snapshot-attribute,comwww,ec2-deregister,bixo,provision,mac_build,num-cpus,debug,make_coverage,pushwiki,ec2ratt,ec2run,merge-dictionaries,runtest,connect,lfs,initwiki,makefolder,mkbk,ec2-create-customer-gateway,ec2allocaddr,ec2-associate-dhcp-options,guppi_start_data,mkpkgs,init_esp,ec2-version,ec2addvpn,tmpl,pushwww,ocaml-objcopy-macosx,sbt,initscript,ec2addvpc,gcc-android,tmux-go,icon-theme-installer,ec2delpgrp,ec2delkey,ec2-confirm-product-instance,bash,rtest,ec2attvgw,adia,ec2-describe-dhcp-options,pre-commit,unpack-diskimage,ec2delvol,put-many,runme,mkdist,gradlew,ec2-delete-group,profile_scala,hook,testdist,ec2-cancel-bundle-task,modgit,ec2-add-group,ooc-bin,ec2assocdopt,ec2-delete-subnet,collectfromsource,pullwiki,test_dumpdata,ec2min,svnstatus,ec2-describe-availability-zones,ec2-modify-instance-attribute,configure,backup-manager,OfflineMaps,keystone_postinstall,ec2-describe-placement-groups,debian-init,run-test,ec2disaddr,ec2ver,vegas_init_shmem_small_pkts,ec2-describe-keypairs,ec2riatt,init_eclscheduler,from-cabal,test_all_versions,griffonw,ec2-detach-vpn-gateway,preader_deploy,build,ec2-create-image,ec2reladdr,ec2-detach-volume,goenv,startcompile,ec2-modify-image-attribute,check_performance,deploy,diffmanagement,ec2dcgw,ec2-reset-instance-attribute,inputmenu,ec2auth,ec2-register,knife_node_find,ec2-delete-placement-group,multiscp,make-pdf,ec2attvol,clean,dossh,alonexecc,runtests,doc2ghpages,ec2daz,reset_for_backup,ec2delgrp,stop_thor,ec2-delete-snapshot,ec2fp,run1,list-exports,ec2-describe-instance-attribute,ec2rsi,create-hadoop-image,gofr_completion,linecount,ec2-cancel-spot-instance-requests,ec2minatt,mkstart,guppi_init_shmem,vegas_setup_shmem_mode13,makengo,init_dali,make_css,ec2cpi,create-test-volume,gen,dgrep,ec2-reset-image-attribute,ec2detvol,remove,clean-directory,release,create-dmg,shamu_par_driver,dump,ec2-migrate-image,comdoc,NOTES,ec2deldopt,ec2-describe-addresses,inno,vegas_setup_shmem_mode13_sim,terminate-hadoop-cluster,ec2matt,ec2adddopt,ec2-describe-reserved-instances,initwww,ec2-delete-dhcp-options,ec2delsnap,ec2rimatt,run_keypatch,ch-enc,ibrun_par_driver,project-template,run-mangosd,ec2delvpn,ec2-get-console-output,ec2dbun,gibak,ec2-purchase-reserved-instances-offering,start-hanoi,ec2-reset-snapshot-attribute,formatcode,uwsgi_surrealrecipes,hadoop-ec2,ec2umin,init_ftslave,rm_shmem,openproj,ec2start,ec2cbun,git-svn-externals-update,linux,ec2dimatt,postupgrade,gcc-android-r4b,kmodtool,ec2msnapatt,rebuild,make-results,launch-hadoop-master,sort-potfiles,jsawk,vegas_setup_shmem_small_pkts,check-for-zombies,ec2daddr,init_eclccserver,problems-filed-graph,makesystem,init_thor,svnversion,setup_nfs,disabled,ec2-describe-licenses,osm_indent,runlivereload,rename,gen-log-wrapper,griffon-debug,ec2-delete-customer-gateway,ec2dsnap,init_roxie,player,ec2addvol,ucengine-admin,ec2delvpc,ec2revoke,make,ec2delcgw,split,ec2dsph,pine-spellcheck,run_thor,ec2-attach-volume,wheel,set as wallpaper,keystone_preinstall,git-svn-externals-check,new-create-dmg,ec2-create-placement-group,run jar,make-tests,ec2-describe-spot-instance-requests,command,start_slaves,postinst,ec2-create-vpn-gateway,remove-temps,pkginstall,ec2-monitor-instances,topos,guppi_status,delete-hadoop-cluster,ec2-delete-vpc,start_slave,3_COMMIT,problem-creation-graph,tests,ec2dpgrp,ec2-describe-reserved-instances-offerings,runtest4,ec2-describe-group,buildforweb,rotate,ec2detvgw,ec2-delete-vpn-gateway,ec2prio,update_install,make-announcement,package-me,t,ec2datt,runtest2,ec2-reboot-instances,old,copismall,run-tests,list-hadoop-clusters,ec2dgrp,gettext-merge,run-gparted,PyICQt,guppi_monitor_parspec,mktemplate,ec2-describe-instances,makethorgroup,ec2dkey,ec2-describe-customer-gateways,ec2-create-volume,libsdp_indent,vpnc-script,ec2-describe-image-attribute,cgi,run,dummy_driver,ge-ls,Command,locker_scala,post,MAKEDEV,ec2-describe-spot-price-history,engine_postinstall,ec2-terminate-instances,ec2din,ec2dim,ng-server,copyregistry,ec2dvol,multissh,killconfigmgr,rtestall,gcc-android-crystax,ec2-create-subnet,MFSconfigure,ec2-request-spot-instances,vegas_init_shmem,ec2bundle,celerydrun,cmd-hadoop-cluster,engine_preinstall,ucengine,mkd,prepare,ec2-create-dhcp-options,minify-static,start,copyworkerdata,quanta,ec2addcgw,ec2-run-instances,startstopworkers,make-changelog-diff,war,setup64,ec2-activate-license,qsub,1_CHECKOUT,mkguide,pull,watch_tim,ec2-modify-snapshot-attribute,restarter,init_configesp,cake,Master,ec2deactlic,test-cluster,ec2reg,ec2-associate-address,guppi_stop_data,ec2-create-snapshot,scp-sourceforge,codegen-anyvals,ec2delsds,ec2dvpc,ec2-create-spot-datafeed-subscription,ec2ddopt,ec2dvpn,rptctl,gensource,guppi_monitor_plotonly,flood,cleanup,preflight,ec2cim,2_UPDATE,test,riak,guppi_set_params,smoketest,tomcatd,find-gradle,truncate,mpich2_par_driver,ec2addgrp,CompareAll,ec2-cmd,ec2dinatt,svn,nxt,ec2-create-vpc,ec2-delete-volume,gettext-extract,chown,ec2addkey,ec2diatt,2-r1,ec2csir,init_dfuserver", "license,under,variable,start,devnull,binbash,software,parameter,undefined,missing,workers,version,usrbinenv,copyright,distributed,without,script,directory,local,either"));
        classifier.add(new Classifier("ActionScript", "as", "function,public,return,static,xtimesbox,xtime,const,class,private,style,param,package,string,copyright,xtimeb,invsbox,inheritno,xtimed,xtimee,license"));
        classifier.add(new Classifier("MXML", "mxml", "function,width,height,private,import,public,version,color,return,xmlnsmxhttpwwwadobecommxml,license,software,right,value,paddingleft,false,paddingright,mxhbox,bigbluebutton,fontsize"));
        classifier.add(new Classifier("ASP", "asa,asp", "width,classpx,fontsize,table,lineheight,height,color,border,alignmiddle,cellspacing,cellpadding,fontweight,select,monthmnytime,heighttd,solid,aligncenter,where,srcimagesspacergif,option"));
        classifier.add(new Classifier("D", "d", "return,const,messageid,messagetext,alias,dword,xconst,version,sizet,static,value,offset,license,string,extern,struct,module,copyright,error,image"));
        classifier.add(new Classifier("Pascal", "p,pp,pas,dpr,inc", "begin,property,result,integer,procedure,function,dispid,value,string,const,write,boolean,widestring,olevariant,localize,pointer,false,esignature,integerbegin,readonly"));
        classifier.add(new Classifier("Scala", "scala", "license,string,extends,class,under,match,override,implicit,distributed,package,import,object,value,boolean,copyright,version,private,false,request,chrome"));
        classifier.add(new Classifier("DOS Batch", "bat,cmd,BAT", "errorlevel,exist,build,license,ckbug,variables,files,environment,endif,error,string,version,sphinxbuild,allsphinxopts,under,defined,finished,offrem,which,command"));
        classifier.add(new Classifier("Groovy", "groovy", "license,assert,string,assertequals,return,under,class,static,author,version,distributed,package,value,extends,should,private,false,assertnotnull,column,required"));
        classifier.add(new Classifier("XSLT", "xsl,xslt", "xslwhen,xslcalltemplate,xslapplytemplates,xslif,xslwithparam,xslvariable,xslvalueof,xslchoose,xslotherwise,select,xslattribute,xslparam,xsltemplate,xsltext,version,xslforeach,table,license,xsltextxsltext,foblock"));
        classifier.add(new Classifier("Perl", "cgi,convert,old2,old,update_data,pprof,pkg-dmg,pl,KhorosToMatLab,cpanorg_perl_releases,cpanorg_rss_fetch,AllKhorosToML,t,make-makefile,dbfetch,Reddit_Image_Scraper,slurp_data_cd,convert_aix,pl,pm", "return,returns,usage,function,title,object,shift,value,defined,sequence,print,module,string,unless,mailing,bioperl,start,method,array,please"));
        classifier.add(new Classifier("Teamcenter def", "def", "classcomment,required,message,optional,classnumberuintspan,value,default,noname,integer,classstringstringspan,operand,number,which,deftreecode,class,function,repeated,string,counter,object"));
        classifier.add(new Classifier("IDL", "idl,pro", "begin,endif,license,return,version,value,array,print,string,values,number,under,keyword,which,function,parameter,default,either,color,terms"));
        classifier.add(new Classifier("Lua", "lua,rockspec,clpmd", "local,function,return,event,thenif,thenlocal,button,frame,value,false,endif,index,dolocal,right,topleft,functionself,elseif,endlocal,thenreturn,width"));
        classifier.add(new Classifier("Go", "go", "return,string,struct,package,value,license,range,mainimport,oserror,interface,error,float,panicif,false,under,tprotocolexception,client,nilfunc,player,thetype"));
        classifier.add(new Classifier("yacc", "y", "string,expression,parse,hbcompparam,return,static,hbcompexprsetoperand,empty,identifier,error,struct,number,value,gcolumn,token,asexpr,function,define,amfree,hbmacroparam"));
        classifier.add(new Classifier("Cython", "pyx", "return,double,raise,object,class,value,array,except,print,chkerr,float,result,values,pyssizet,unsigned,string,start,import,sizet,function"));
        classifier.add(new Classifier("lex", "l", "return,yytext,count,hbcompistate,yylvalival,begin,returnintegerconstant,identifier,yyleng,warning,string,break,unput,error,character,software,yylval,setlasttoken,instsizesize,while"));
        classifier.add(new Classifier("Ada", "pad,adb,ads,ada", "constant,unsigned,bitnumber,register,pragma,volatile,timercounter,address,bitsinbyte,compare,output,input,return,interrupt,enable,string,procedure,function,begin,character"));
        classifier.add(new Classifier("sed", "cleanup-header,cproto,sed,gcc-wall-cleanup", "license,system,software,optionf,public,should,general,change,version,foundation,remove,without,plplot,warranty,convert,library,comment,include,number,message"));
        classifier.add(new Classifier("m4", "m4,ac", "devnull,software,shared,library,compiler,check,version,define,libobjs,deplibs,without,foundation,which,libraries,autoconf,using,support,default,copyright,libtool"));
        classifier.add(new Classifier("Ocaml", "ml,mli,mly,mll", "match,method,begin,string,false,raise,value,inlet,function,invoke,license,cvoid,module,float,software,failure,xvalue,ignore,clist,mutable"));
        classifier.add(new Classifier("Smarty", "tpl", "border,cellspacing,cellpadding,width,tdfont,height,widthtr,srcimgpxpng,srcimgbarpng,aligncenterfont,return,value,table,messages,bgcolorbbtrtdtable,translated,coresponding,endif,messagesbrnbspnbspimg,classpackage"));
        classifier.add(new Classifier("ColdFusion", "cfm", "cfset,typestring,requiredfalse,exception,documentation,hintsee,accesspublic,handler,default,outputfalse,plugin,cftrace,based,typeinformation,textcustom,called,requiredtrue,error,cfcatch,object"));
        classifier.add(new Classifier("NAnt scripts", "build", "include,target,property,fileset,build,version,project,software,exclude,sources,files,source,university,output,mkdir,delete,following,notice,description,message"));
        classifier.add(new Classifier("Expect", "exp", "testname,global,break,string,istarget,match,exists,execoutput,license,return,tests,ldlibrarypath,software,verbose,expect,program,perror,while,public,general"));
        classifier.add(new Classifier("C Shell", "plsp_fe,plt-install,Special-Flags,jobsubs,test_xforms,runpc,convtof,gwsc1shot,gwsc_repeat,whnamchk,post-process,gwsc_ex,plsp_ni,plbnds,aspect,qconvr,ftpPublish,bandngspin,scr,extract_elda_from_log_file,makeVMWorkingTree,make_gifs_html,testit,cleargw_all,db_looper,xpmtopp,tt,UPreident,gwsc1shot_exonly,submitall,lagao,zaplinks,0,ex5,assignchk,get_load,tb,shrm,tote_lmfh2,tote_lmfh3,gwsc1,do,fixlinks,sshrc,gwpara_lmf,get_arch,bkp_lc,hopper,bandp,safe,Compare,cleargw,aqdrst,PublishCompare,makesplitlib,aqpc,createSourceLinks,tote_lmfh2_s0,debugger2,plsp,totlattice_s0,testPragma,pbs,simulator_script,pldos,go_enzo,remove,o2,diffchk,UPcasa,runpcsplit-resN,eps_lmfh_chipm,gw_spectrum,UPlock,bandpspin2,savegw,UPsed,sigm_lmfh,simulator_run3,fp,minstall,modvers-src,runBLIPClient,Script,Browse,toMirror,linux,startup,Publish,batch,pqf,goodscript,diffwrf,aq2x,make_lib,build_codebase,qsumm,libsync,grompplog2top,bandp_scaled,cleanit,sub,redunchk,make_glue,epsPP_lmfh,start_idlhelp,convccomp,calj_summary_mat,makedate,gwsc_exonly_bk,template,2ss,hqpemetal,gwsc1shot_repeat3,g1test,Do_troff,make_example,qhelp,gera_distr,testmesh,MakeIcons,gws1shot,vim132,update_path,tstinst,unkinstall,packfpgw,eps_lmf_chipm,makeSelfWorkingTree,eps_lmf,gw_lmfh,gwsc_repeat2,add0,old_updateLink,bandng,make-times,bandpdos2,range,expandNames,UPlist,cleargw_allplus,redump,extract-lines,summlatt1,resyntax,infgw2,changes,ndt,SPASST,bandpdoslda,prepexp,fplot,pw5,danger,h2,make_vmDate,Make,dir_size,run_tests,ConvertRevisions,looper,delete_xlib_symlinks,plsp_fe_nolfc,link_codebase_to_wrfbrowser,nocompile,gw_lmfh_t,org,buildscripts,li,sge,mkhtml,tstarg0,db_query,slatsm,bandpspin,pq,int8toint,Configure,openmpi,cath,BuildJavaClient,make_dist,cray,epsPP_lmfh_chipm,testomatic,make_ppm,postprocess,emacs,runBLIPListener,infgw,run_h200,test_xforms_isolated,gwband_lmf,totlatticet,jobslatsm,bandpfe,ex4,configure,mkGWIN_lmf2,stripCR,frost,nc,make_incs,doc2p,copyto,commit_hash,mvapich,ex1,make_xlib_symlinks,check_locks,mva,epsPP_lmfh_chipm_q,UPdup,UPfind,moveto,mf,xsession,extest_repeat,qsel,modvers-doc,complchk,do-git,package,mktex,eps_lmfh,compile,spatch_linux_script,gwsc_3,mmag,deps,lynx,postexp,export,db_count,wh_generic,totlattice,extest,gwnc_nfp,gwpara_lmfh,demo,UPtmpl,calj_nlfc_metal,xtest,kinstall,compareto,xrun,undangle,makellvm,epsPP_lmf,csh,bandpdos,epsPP_lmf_chipm,UPchange,ex6,ex7,UPmove,cleanup,ex2,ex3,4-linux,plsp_ni_2,make-times-optonly,config,test_cube,pan,test_cube_static,profile,qconvert,epsPfrombas,pqd,gws,tcsh,gw_lmfhtest,gwsc,eee,pqk,jet_unix,jszip,xpan,gwsc30,CreateFileStatus,epstest,watch_tcp,build,COPY,gw_nfp,mkcompl,nsspath,pushLink,plsp_e,gw_lmf,unminstall,sortn,kraken,UPload,runpcsplit,plsp_fe2,savegwfiles,dbopn,smbadduser,2007,clean,xqp,makeFileLists,pdos_lmso", "endif,space,print,thenset,files,workfile,complete,status,directory,bincsh,thenecho,script,error,usage,basefile,hostname,license,setenv,output,version"));
        classifier.add(new Classifier("VHDL", "vhd,vhdl", "downto,stdlogicvector,stdlogic,signal,gamea,constant,return,epromentry,integer,function,others,variable,begin,generic,process,result,unsigned,buuisynthoptinonzerofractisynthialgornrisdividerisynthoptionisynthmodeldividerblkdivloopaddergenregreqadsumodaddnopipeliningtheaddsubilutilutaddsubiqisimpleqregfirstq,input,output"));
        classifier.add(new Classifier("Tcl/Tk", "timer,widget,ports-cur,browse,src-special,src-cur,smp-cur,rolodex,ixset,color,tcl,tk,dialog,cvs-cur,gnats,hello,tkpkg,size", "return,create,stderr,command,catch,failed,string,width,should,frame,global,color,lindex,error,variable,floor,program,assertequal,button,relief"));
        classifier.add(new Classifier("JSP", "jsp", "width,sproperty,sparam,height,typetextjavascript,color,solid,input,border,floatleft,value,charsetutf,aligncenter,chineseprccias,collate,return,tdnbsptd,cellpadding,table,widthpx"));
        classifier.add(new Classifier("SKILL", "il", "method,class,instance,public,default,managed,hidebysig,specialname,static,begins,xmaxstack,virtual,custom,private,ldsfld,field,ldarg,valuetype,rtspecialname,double"));
        classifier.add(new Classifier("awk", "bisonerrors,fixfort,oct2mat,sum,make_mli,audit_use_process_log,gen-mach-types,addtosmbpass,awk,build-media-file,awklisp,vercmp,gensequences,average,create_stubs", "print,printf,return,function,label,software,plotfmt,state,license,substr,copyright,maxtime,comment,match,lines,output,version,define,titlelab,value"));
        classifier.add(new Classifier("MUMPS", "m,mps", "version,property,nsuinteger,languageaspect,targetnodeid,const,string,curveto,count,sizet,nsstring,value,error,exception,unsigned,return,options,status,namename,array"));
        classifier.add(new Classifier("Korn Shell", "ksh", "license,header,copyright,print,include,subject,usrsrcopensolarislicense,terms,under,version,thenecho,script,following,start,rights,contents,information,billingcycle,below,specific"));
        classifier.add(new Classifier("Fortran 95", "f95", "integer,intentin,print,subroutine,function,precision,write,double,dirfile,matrix,dimension,character,program,value,infield,module,ierror,input,failed,enddo"));
        classifier.add(new Classifier("Oracle Forms", "fmt", "format,value,return,status,param,writer,reader,public,static,debugenunciate,element,qname,vformat,documentation,aformat,write,sformat,pformat,rformat,iformat"));
        classifier.add(new Classifier("Dart", "dart", "points,string,ballx,bally,diffs,false,return,diffdiffequal,static,trianglepoints,trianglesaddnew,canvasheight,canvaswidth,ballradius,final,diffdiffdelete,canvas,diffdiffinsert,ballvx,textlength"));
        classifier.add(new Classifier("COBOL", "COB,CBL,cbl,cob", "position,flags,verts,parent,animationsettype,frames,vertexvertex,display,perform,using,value,division,section,endif,class,procedure,benchend,linkv,string,compute"));
        classifier.add(new Classifier("Modula3", "i3,mg,ig,m3", "token,syntax,operator,final,classificationoperator,typename,import,module,hexdigit,abstract,leftarg,isbuiltintype,right,rightarg,typearguments,expression,operand,error,backslash,ccomma"));
        classifier.add(new Classifier("Oracle Reports", "rex", "copyright,following,method,provided,conditions,including,return,software,contributors,source,expose,available,class,above,without,binary,language,limited,notice,distribution"));
        classifier.add(new Classifier("Softbridge Basic", "sbl", "rscreen,display,rctxt,ilength,imtime,ichans,iatime,bvers,rdisplay,smuid,limbo,iqtype,asysdir,bdtype,iasysqid,iadrawchans,riname,idisplay,image,rtransparent"));

        // various custom ones...
        // usually missing the text types
        classifier.add(new Classifier("Markdown", "md", ""));
        classifier.add(new Classifier("git-ignore", "gitignore", ""));
        classifier.add(new Classifier("Freemarker Template", "ftl", ""));
        classifier.add(new Classifier("Less CSS", "less", ""));
        classifier.add(new Classifier("Gradle", "gradle", ""));
        classifier.add(new Classifier("Basic", "bas", ""));
        classifier.add(new Classifier("GolfScript", "golfscript", ""));
        classifier.add(new Classifier("LaTeX", "tex", ""));
        classifier.add(new Classifier("Boo", "boo", ""));
        classifier.add(new Classifier("Julia", "jl", ""));
        classifier.add(new Classifier("Delphi", "delphi", ""));
        classifier.add(new Classifier("LOLCODE", "lol", ""));
        classifier.add(new Classifier("B", "b", ""));
        classifier.add(new Classifier("Chef", "ch", ""));
        classifier.add(new Classifier("Racket", "rkt,rktl,ss,scm,scrbl", ""));
        classifier.add(new Classifier("Swift", "swift", ""));
        classifier.add(new Classifier("JSON", "json", ""));
        classifier.add(new Classifier("Octave", "octave", ""));
        classifier.add(new Classifier("Elixir", "exs", ""));
        classifier.add(new Classifier("Factor", "factor", ""));
        classifier.add(new Classifier("Vim Script", "vim", ""));
        classifier.add(new Classifier("Powershell", "ps1,psm1", ""));
        classifier.add(new Classifier("Eiffel", "eiff", ""));
        classifier.add(new Classifier("Scalable Vector Graphics", "svg", ""));
        classifier.add(new Classifier("Rust", "rs", ""));
        classifier.add(new Classifier("MUSHCode", "mush", ""));
        classifier.add(new Classifier("Logo", "lg", ""));
        classifier.add(new Classifier("Nim", "nim", ""));
        classifier.add(new Classifier("Wolfram Language", "wl", ""));
        classifier.add(new Classifier("Purebasic", "pb", ""));
        classifier.add(new Classifier("ArnoldC", "arnoldc", ""));
        classifier.add(new Classifier("VRML", "wrl", ""));
        classifier.add(new Classifier("Coffeescript", "coffee", ""));
        classifier.add(new Classifier("SPDX", "spdx", ""));
        classifier.add(new Classifier("TypeScript", "ts", ""));
        classifier.add(new Classifier("JSX", "jsx", ""));
        classifier.add(new Classifier("Ruby Template", "erb", ""));
        classifier.add(new Classifier("XML Resource", "resx", ""));
        classifier.add(new Classifier("Varnish Configuration", "vcl", ""));
        classifier.add(new Classifier("Jade Template", "jade", ""));
        classifier.add(new Classifier("ReStructuredText", "rst", ""));
        classifier.add(new Classifier("CSV", "csv", ""));
        classifier.add(new Classifier("Razor Template", "cshtml", ""));
        classifier.add(new Classifier("Handlebars Template", "hbs", ""));
        classifier.add(new Classifier("INI File", "ini", ""));
        classifier.add(new Classifier("Configuration", "conf", ""));
        classifier.add(new Classifier("Clojure", "clj", ""));
        classifier.add(new Classifier("Visual NDepend", "ndproj", ""));
        classifier.add(new Classifier("Device Tree Source", "dts", ""));
        classifier.add(new Classifier("ASP.NET Web Handler", "ashx", ""));
        classifier.add(new Classifier("Gherkin Specification", "feature", ""));
        classifier.add(new Classifier("Haxe", "hx", ""));
        classifier.add(new Classifier("Qt Meta Language", "qml", ""));
        classifier.add(new Classifier("Style Sheet eXtender", "cssx", ""));
        classifier.add(new Classifier("Scratch Project File", "sb", ""));
        classifier.add(new Classifier("Precompiled Header", "pch", ""));
        classifier.add(new Classifier("Opalang", "opa", ""));
        classifier.add(new Classifier("Portage Installer", "ebuild", ""));
        classifier.add(new Classifier("Crystal", "cr", ""));
        classifier.add(new Classifier("Jenkins Buildfile", "jenkinsfile", ""));
        classifier.add(new Classifier("Kotlin", "kt", ""));
        classifier.add(new Classifier("Properties File", "properties", ""));
        classifier.add(new Classifier("Tag Library Descriptor", "tld", ""));
        classifier.add(new Classifier("Syntactically Awesome StyleSheets", "scss", ""));
        //
    }

    public List<Classifier> getClassifier() {
        return this.classifier;
    }

    public void setClassifier(List<Classifier> classifier) {
        this.classifier = classifier;
    }
}
